package Reservas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class Incidencias {
    private static boolean horaExactaIncidencia = false;
    private static Set<String> lineaImprimir = new HashSet<>();


    public static void logIncidencias(String[] reserva, String titulo, int fecha, int diaDeSemana, int hora) {
        try {
            String conflicto = "Error: The reservation for '" + titulo + "' on the  " + fecha +
                    ", at " + hora + ", has caused a conflict.";

            // Extrae el valor de la linea que da el error.
            String lineaAnalizada = reserva[reserva.length - 1];

            if (!lineaImprimir.contains(lineaAnalizada)) {
                PrintWriter escribirIncidencias = new PrintWriter(new FileWriter("incidencias.log", true));


                if (!horaExactaIncidencia) {
                    escribirIncidencias.println("*".repeat(48));
                    escribirIncidencias.println("    Timestamp: " + new java.util.Date());
                    escribirIncidencias.println("*".repeat(48));
                    horaExactaIncidencia = true;
                }
                escribirIncidencias.println("Line that caused the error: ");
                escribirIncidencias.println(lineaAnalizada);
                escribirIncidencias.println(conflicto);
                escribirIncidencias.println();
                escribirIncidencias.close();
                lineaImprimir.add(lineaAnalizada);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
