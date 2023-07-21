package Reservas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Month;
import java.util.*;

public class LecturaInternacional {
    private static final Map<Integer, List<String>> outputLang = new HashMap<>();
    private static String day;
    private static String month;

    public static Map<Integer, List<String>> getOutputLang() {
        return outputLang;
    }

    public static void readInternationalizationOUTFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(";");
                int codigo = Integer.parseInt(partes[0]);
                List<String> values = new ArrayList<>(Arrays.asList(partes).subList(1, partes.length));
                outputLang.put(codigo, values);
            }
        }
    }

    public static String month(Month x) {
        switch (x) {
            case JANUARY -> month = outputLang.get(3).get(0);
            case FEBRUARY -> month = outputLang.get(3).get(1);
            case MARCH -> month = outputLang.get(3).get(2);
            case APRIL -> month = outputLang.get(3).get(3);
            case MAY -> month = outputLang.get(3).get(4);
            case JUNE -> month = outputLang.get(3).get(5);
            case JULY -> month = outputLang.get(3).get(6);
            case AUGUST -> month = outputLang.get(3).get(7);
            case SEPTEMBER -> month = outputLang.get(3).get(8);
            case OCTOBER -> month = outputLang.get(3).get(9);
            case NOVEMBER -> month = outputLang.get(3).get(10);
            case DECEMBER -> month = outputLang.get(3).get(11);
        }
        return month;
    }
    public static String diaSemana(String x) {
        switch (x) {
            case "MONDAY" -> day = outputLang.get(2).get(0);
            case "TUESDAY" -> day = outputLang.get(2).get(1);
            case "WEDNESDAY" -> day = outputLang.get(2).get(2);
            case "THURSDAY" -> day = outputLang.get(2).get(3);
            case "FRIDAY" -> day = outputLang.get(2).get(4);
            case "SATURDAY" -> day = outputLang.get(2).get(5);
            case "SUNDAY" -> day = outputLang.get(2).get(6);
        }
        return day;
    }
}