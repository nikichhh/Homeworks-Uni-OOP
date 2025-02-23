package bg.tu_varna.sit.b2.f23621689.homework1;
import java.io.*;
import java.util.Date;

public class FileLogger {
    private static final String ERROR_LOG = "src/bg/tu_varna/sit/b2/f23621689/homework1/LocalErrors.txt";

    public static void logError(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ERROR_LOG, true))) {
            writer.write(new Date() + " - " + message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
