package Reservas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RegistroGeneral {

    private static boolean isTimestampPrinted = false;
    private static Set<String> printedLines = new HashSet<>();

    public static Set<String> getPrintedLines() {
        return printedLines;
    }

    public static void registroGeneral(Map<Integer, List<String[]>> reservas) {
        try (PrintWriter logWriter = new PrintWriter(new FileWriter("registro_general.log", true))) {

            if (!isTimestampPrinted) {
                logWriter.println("*".repeat(48));
                logWriter.println("    Timestamp: " + new java.util.Date());
                logWriter.println("*".repeat(48));
                logWriter.println("Lines that were processed: ");
                isTimestampPrinted = true;
            }

            for (List<String[]> reservationList : reservas.values()) {
                for (String[] reservation : reservationList) {
                    String line = reservation[reservation.length - 1];
                    if (printedLines.add(line)) {
                        logWriter.println(line);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
