package bg.tu_varna.sit.b2.f23621689.homework6.task1;

public class SciFiNovel extends Book{

    public SciFiNovel(String title, Author author, int publishingYear, double price, boolean hasHardCover) {
        super(title, author, publishingYear, price, hasHardCover);
    }

    @Override
    public double calculateMargin() {
        if (!hasHardCover()) {
            return getPrice() * 0.09;
        } else {
            return getPrice() * 0.12;
        }
    }
}
