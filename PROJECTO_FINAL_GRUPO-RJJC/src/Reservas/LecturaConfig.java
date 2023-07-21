package Reservas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaConfig {
    private static int anyo;
    private static int mes;
    // Getters
    public static int getAnyo() {
        return anyo;
    }
    public static int getMes() {
        return mes;
    }

    public static void lecturaConfig(String config) throws IOException {
        try (BufferedReader configLectura = new BufferedReader(new FileReader(config))) {
            String configLinea = configLectura.readLine();
            String[] partes = configLinea.split(" ");
            if (partes.length != 2) {
                throw new IOException("Formato Invalido.");
            }
            anyo = Integer.parseInt(partes[0]);
            mes = Integer.parseInt(partes[1]);

            String configLinea2 = configLectura.readLine();
            String[] partes2 = configLinea2.split(" ");
            if (partes2.length != 2) {
                throw new IOException("Formato Invalido.");
            }
            String outLang = (partes2[1]);

            String outlFile = "internacional." + outLang;
            LecturaInternacional.readInternationalizationOUTFile(outlFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
