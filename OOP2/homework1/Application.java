package bg.tu_varna.sit.b2.f23621689.homework1;


public class Application {
    public static void main(String[] args) {
        VerificationKeyGenerator alphanumericGen = new AlphanumericKeyGenerator();
        VerificationKeyGenerator numericGen = new NumericKeyGenerator();

        KeyStorage alphanumericStorage = new KeyStorage("src/bg/tu_varna/sit/b2/f23621689/homework1/AlphanumericKeys.txt");
        KeyStorage numericStorage = new KeyStorage("src/bg/tu_varna/sit/b2/f23621689/homework1/NumericKeys.txt");
        KeyStorage forceDeleteStorage = new KeyStorage("src/bg/tu_varna/sit/b2/f23621689/homework1/NumericKeys.txt");

        String alphaKey = alphanumericGen.generateKey();
        String numKey = numericGen.generateKey();
        alphanumericStorage.saveKey(alphaKey);
        numericStorage.saveKey(numKey);
        String forceDeleteKey = numericGen.generateKey(); // Ключ, който ще изтрием преди проверката
        numericStorage.saveKey(forceDeleteKey);

        System.out.println("Generated Alphanumeric Key: " + alphaKey);
        System.out.println("Generated Numeric Key: " + numKey);
        System.out.println("Generated Key for Forced Deletion: " + forceDeleteKey);

        // Принудително изтриване на forceDeleteKey преди проверката
        System.out.println("\nForcing deletion of key: " + forceDeleteKey);
        boolean deleted = numericStorage.validateAndRemoveKey(forceDeleteKey);
        if (deleted) {
            System.out.println("Key " + forceDeleteKey + " was manually deleted.");
        }

        // Валидация на вече изтрития ключ (трябва да доведе до грешка)
        System.out.println("\nTrying to validate and remove deleted key...");
        if (!numericStorage.validateAndRemoveKey(forceDeleteKey)) {
            System.out.println("Error: Key " + forceDeleteKey + " not found in file (should be logged).");
        }

        if (alphanumericStorage.validateAndRemoveKey(alphaKey)) {
            System.out.println("Key " + alphaKey + " validated and removed.");
        } else {
            System.out.println("Key " + alphaKey + " not found.");
        }

        if (numericStorage.validateAndRemoveKey(numKey)) {
            System.out.println("Key " + numKey + " validated and removed.");
        } else {
            System.out.println("Key " + numKey + " not found.");
        }
    }
}
