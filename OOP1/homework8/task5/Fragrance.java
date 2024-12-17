package bg.tu_varna.sit.b2.f23621689.homework8.task5;

public enum Fragrance {
    LEMON("lemon"),
    ORANGE("orange"),
    KIWI("kiwi"),
    PEACH("peach"),
    APPLE("apple"),
    PEAR("pear"),
    COLA("cola");

    private final String displayName;

    Fragrance(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
