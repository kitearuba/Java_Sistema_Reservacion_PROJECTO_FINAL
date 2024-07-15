package Main;

import Reservas.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Main reservas = new Main();
        reservas.ejecutar();
    }
    private void ejecutar() {
        try {
            LecturaConfig.lecturaConfig("config.txt");
            Map<Integer, List<String[]>> reservas = LecturaPeticiones.lecturaPeticiones();
            HtmlPublicar.escrituraHtml(HtmlCrearCodigo.generaIndexHtml(), "index.html");
            HtmlPublicar.escrituraHtml(HtmlCrearCodigo.generaSalaHtml(reservas.get(1),
                    LecturaInternacional.getOutputLang().get(5).get(0)), "reservas_sala1.html");
            HtmlPublicar.escrituraHtml(HtmlCrearCodigo.generaSalaHtml(reservas.get(2),
                    LecturaInternacional.getOutputLang().get(4).get(0)), "reservas_sala2.html");

        } catch (IOException e) {
            System.err.println("Error leyendo los archivos: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Formato numerico no valido en los archivos: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error Fatal No Esperado: " + e.getMessage());
        }
    }
}
