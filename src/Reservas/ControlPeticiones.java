package Reservas;

import java.time.LocalDate;
import java.util.*;

public class ControlPeticiones {
    private static Map<String, String> previousConflicts = new HashMap<>();
    private static Map<String, String> colorMapa = new HashMap<>();
    public static String getCellValor(List<String[]> salaReservas, int fechaVar, int diaDeSemana, int hora) {
        for (String[] reserva : salaReservas) {
            String titulo = reserva[0];
            LocalDate fechaInicio = LocalDate.parse(reserva[1]);
            LocalDate fechaFin = LocalDate.parse(reserva[2]);
            String diasSemana = reserva[3];
            String horas = reserva[4];
            LocalDate fecha = LocalDate.of(LecturaConfig.getAnyo(), LecturaConfig.getMes(), fechaVar);
            if(Objects.equals(titulo, "C")){
                titulo = LecturaInternacional.getOutputLang().get(7).get(0);
            }

            if (!fecha.isBefore(fechaInicio) && !fecha.isAfter(fechaFin) && diasSemana.contains(String.valueOf(diaDeSemana))) {
                if (isDentroDelHorario(horas, hora)) {
                    if (isReservado(salaReservas, fechaVar, diaDeSemana, hora, titulo)) {
                        return "<div style=\"background-color: " + getColorParaTitulo(titulo) + ";\">" + titulo + "</div>";
                    } else {
                        String oldConflict = previousConflicts.get(titulo);
                        if (oldConflict != null) {
                            return "<div class=\"conflict\" style=\"animation;\">" + oldConflict + "</div>" +
                                    "<div class=\"conflict1\" style=\"animation;\">" + titulo + "</div>";
                        } else {
                            return "<div class=\"conflict\" style=\"animation;\">" + titulo + "</div>";
                        }
                    }
                }
            }
        }
        return "";
    }
    private static boolean isReservado(List<String[]> salaReservas, int fechaVar, int diaDeSemana, int hora, String titulo) {
        int contador = 0;
        String conflictingTitulo = null;
        for (String[] reserva : salaReservas) {
            LocalDate fechaInicio = LocalDate.parse(reserva[1]);
            LocalDate fechaFin = LocalDate.parse(reserva[2]);
            String diasSemana = reserva[3];
            String horas = reserva[4];

            RegistroGeneral.registroGeneral(LecturaPeticiones.getReserva());

            LocalDate fecha = LocalDate.of(LecturaConfig.getAnyo(), LecturaConfig.getMes(), fechaVar);

            if (!fecha.isBefore(fechaInicio) && !fecha.isAfter(fechaFin) && diasSemana.contains(String.valueOf(diaDeSemana))) {
                if (isDentroDelHorario(horas, hora)) {
                    if (++contador > 1) {
                        conflictingTitulo = reserva[0];
                        Incidencias.logIncidencias(reserva, titulo, fechaVar, diaDeSemana, hora);
                        previousConflicts.put(titulo, conflictingTitulo);
                        return false;
                    }
                }
            }
        }
        return contador == 1;
    }
    private static String getColorParaTitulo(String titulo) {
        if (!colorMapa.containsKey(titulo)) {
            String color = String.format("#%06x", new Random().nextInt(256*256*256));
            colorMapa.put(titulo, color);
        }
        return colorMapa.get(titulo);
    }
    private static boolean isDentroDelHorario(String horas, int hour) {
        String[] timeRange = horas.split("-");
        int horaInicio = Integer.parseInt(timeRange[0]);
        int horaFin = Integer.parseInt(timeRange[1]);
        return hour >= horaInicio && hour < horaFin;
    }
}
