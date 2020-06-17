import java.security.SecureRandom;

public enum Coin {
    HEADS,
    TAILS;

    public static Coin flip() {
        final SecureRandom random = new SecureRandom();
        return values()[random.nextInt(values().length)];
    }
}
