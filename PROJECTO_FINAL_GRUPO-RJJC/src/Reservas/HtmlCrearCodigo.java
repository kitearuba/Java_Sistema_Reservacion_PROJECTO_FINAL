package Reservas;

import java.time.*;
import java.util.*;

public class HtmlCrearCodigo {
    public static String generaIndexHtml() {
        StringBuilder crearHtml = new StringBuilder();
        crearHtml.append("<!DOCTYPE html>\n")
                .append("<html lang=\"en\">\n")
                .append("<head>\n")
                .append("<meta charset=\"UTF-8\">\n")
                .append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n")
                .append("<link rel=\"stylesheet\" href=\"./estilos/estilos.css\">\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<canvas id=\"canvas\" data-image=\"https://unsplash.it/g/450/200/?random=1\"></canvas>\n")
                .append("<div class=\"intro\">\n")
                .append("<h1>\n").append(LecturaInternacional.getOutputLang().get(1).get(0)).append("</h1>\n")
                .append("<nav>| <a href=\"reservas_sala1.html\">")
                .append(LecturaInternacional.getOutputLang().get(5).get(0)).append("</a> |\n")
                .append("| <a href=\"reservas_sala2.html\">")
                .append(LecturaInternacional.getOutputLang().get(4).get(0)).append("</a> |\n")
                .append("</nav>\n")
                .append("</div>\n")
                .append("<script src=\"./script/js.js\"></script>\n")
                .append("</body>\n")
                .append("</html>");
        return crearHtml.toString();
    }

    public static String generaSalaHtml(List<String[]> salaReservas, String salaName) {
        StringBuilder crearHtml = new StringBuilder();
        YearMonth anyoMes = YearMonth.of(LecturaConfig.getAnyo(), LecturaConfig.getMes());
        LocalDate primerDiaMes = anyoMes.atDay(1);
        int primerDiaSemanaMes = primerDiaMes.getDayOfWeek().getValue();
        int diaActual = 1;

        crearHtml.append("<!DOCTYPE html>\n")
                .append("<html lang=\"en\">\n")
                .append("<head>\n")
                .append("<meta charset=\"UTF-8\">\n")
                .append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n")
                .append("<link rel=\"stylesheet\" href=\"./estilos/estilos.css\">\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<canvas id=\"canvas\" data-image=\"https://unsplash.it/g/450/200/?random=1\"></canvas>\n")
                .append("<div class=\"contain\">\n")
                .append("<h1>").append(salaName).append("</h1>\n")
                .append("</div>\n")
                .append("<div class=\"introSalas\">\n")
                .append("<table border=\"1\">\n")
                .append("<tr><th></th>");

        int fechaMes = 1;
        while (fechaMes <= anyoMes.atEndOfMonth().getDayOfMonth()) {
            crearHtml.append("<table border=\"1\">\n")
                    .append("<tr><th colspan=\"8\">").append(LecturaInternacional.getOutputLang().get(9).get(0))
                    .append(" ").append(LecturaInternacional.month(anyoMes.getMonth())).append(" ").append(fechaMes)
                    .append("</th></tr>\n")
                    .append("<tr><th></th>");

            for (DayOfWeek diaSemana : DayOfWeek.values()) {
                if (diaSemana.getValue() >= 1 && diaSemana.getValue() <= 7) {
                    crearHtml.append("<th>").append(LecturaInternacional.diaSemana(diaSemana.toString())).append("</th>");
                }
            }

            crearHtml.append("</tr>\n")
                    .append("<tr><td></td>");

            for (int diaSemana = 1; diaSemana <= 7; diaSemana++) {
                crearHtml.append("<td>");
                if (diaSemana >= primerDiaSemanaMes && diaActual <= anyoMes.lengthOfMonth()) {
                    crearHtml.append(diaActual++);
                    primerDiaSemanaMes = 1;
                }
                crearHtml.append("</td>");
            }

            for (int hora = 0; hora < 24; hora++) {
                crearHtml.append("<tr><td>").append(String.format("%02d:00 - %02d:00", hora, hora + 1)).append("</td>");
                int diaFechaMes = fechaMes;
                for (int diaSemana = 1; diaSemana <= 7; diaSemana++) {
                    if (diaFechaMes > anyoMes.lengthOfMonth()) {
                        crearHtml.append("<td></td>");
                        continue;
                    }
                    String cellValue = ControlPeticiones.getCellValor(salaReservas, diaFechaMes, diaSemana, hora);
                    if (anyoMes.atDay(diaFechaMes).getDayOfWeek().getValue() == diaSemana) {
                        crearHtml.append("<td>").append(cellValue).append("</td>");
                        diaFechaMes++;
                    } else {
                        crearHtml.append("<td></td>");
                    }
                }
                crearHtml.append("</tr>\n");
            }

            fechaMes = diaActual;
            crearHtml.append("\n</table>\n<br><br>");
        }

        crearHtml.append("</div></div>\n")
                .append("<div class=\"container\">\n")
                .append("<div class=\"theme-switch\">\n")
                .append("<div class=\"switch\"></div>\n")
                .append("</div>\n")
                .append("<div class=\"navigation\">\n")
                .append("<ul>\n")
                .append("<a href=\"index.html\" class=\"active\" target=\"_self\">")
                .append(LecturaInternacional.getOutputLang().get(6).get(0)).append("</a>\n")
                .append("<a href=\"reservas_sala1.html\" target=\"_self\">")
                .append(LecturaInternacional.getOutputLang().get(5).get(0)).append("</a>\n")
                .append("<a href=\"reservas_sala2.html\" target=\"_self\">")
                .append(LecturaInternacional.getOutputLang().get(4).get(0)).append("</a>\n")
                .append("</ul>\n")
                .append("</div>\n")
                .append("</div><script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js'></script><script  src=\"./script/boton.js\"></script><br>")
                .append("<script src=\"./script/js.js\"></script>\n")
                .append("</body>\n")
                .append("</html>");

        return crearHtml.toString();
    }
}
