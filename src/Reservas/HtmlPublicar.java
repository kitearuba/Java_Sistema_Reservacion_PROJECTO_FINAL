package Reservas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HtmlPublicar {
    public static void escrituraHtml(String generaHtml, String archivoTemp) {
        try (PrintWriter escritorHtml = new PrintWriter(new FileWriter(archivoTemp))) {
            escritorHtml.println(generaHtml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
