package bg.tu_varna.sit.b2.f23621689.homework1;
import java.util.Random;

public class NumericKeyGenerator implements VerificationKeyGenerator {
    private static final int LENGTH = 6;

    @Override
    public String generateKey() {
        StringBuilder key = new StringBuilder(LENGTH);
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            key.append(random.nextInt(10));
        }
        return key.toString();
    }
}
