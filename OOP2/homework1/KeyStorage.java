package bg.tu_varna.sit.b2.f23621689.homework1;
import java.io.*;
import java.nio.file.*;
import java.util.List;

public class KeyStorage {
    private final String filePath;

    public KeyStorage(String filePath) {
        this.filePath = filePath;
    }

    public void saveKey(String key) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(key);
            writer.newLine();
        } catch (IOException e) {
            FileLogger.logError("Error saving key: " + e.getMessage());
        }
    }

    public boolean validateAndRemoveKey(String key) {
        try {
            List<String> keys = Files.readAllLines(Paths.get(filePath));
            if (keys.contains(key)) {
                keys.remove(key);
                Files.write(Paths.get(filePath), keys);
                return true;
            }
            FileLogger.logError("Validation failed: Key " + key + " not found in " + filePath);
        } catch (IOException e) {
            FileLogger.logError("Error validating key: " + e.getMessage());
        }
        return false;
    }
}
