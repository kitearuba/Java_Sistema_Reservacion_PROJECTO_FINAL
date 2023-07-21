package Reservas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class LecturaPeticiones {
    private static Map<Integer, List<String[]>> reserva = new HashMap<>();

    public LecturaPeticiones(Map<Integer, List<String[]>> reserva) {
        this.reserva = reserva;
    }

    public static Map<Integer, List<String[]>> getReserva() {
        return reserva;
    }


    public static Map<Integer, List<String[]>> lecturaPeticiones() throws IOException {
        try (BufferedReader lecPeticiones = new BufferedReader(new FileReader("peticiones.txt"))) {
            String linea;
            int numeroLinea = 1;
            while ((linea = lecPeticiones.readLine()) != null) {
                String[] parametros = linea.split(" ");
                int salaIndex = Integer.parseInt(parametros[0]);

                if (!reserva.containsKey(salaIndex)) {
                    reserva.put(salaIndex, new ArrayList<>());
                }
                String[] reservaFecha = Arrays.copyOfRange(parametros, 1, parametros.length);
                reservaFecha[1] = parseFecha(reservaFecha[1]);
                reservaFecha[2] = parseFecha(reservaFecha[2]);

                String[] reservaFechaConNumeroLinea = new String[reservaFecha.length + 2];
                System.arraycopy(reservaFecha, 0, reservaFechaConNumeroLinea, 0, reservaFecha.length);
                reservaFechaConNumeroLinea[reservaFecha.length] = String.valueOf(numeroLinea);
                reservaFechaConNumeroLinea[reservaFecha.length + 1] = linea;

                reserva.get(salaIndex).add(reservaFechaConNumeroLinea);
                numeroLinea++;
            }
        }
        return reserva;
    }
    private static String parseFecha(String fecha) {
        String[] partes = fecha.split("/");
        return partes[2] + "-" + partes[1] + "-" + partes[0];
    }
}
