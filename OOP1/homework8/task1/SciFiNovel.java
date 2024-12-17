package bg.tu_varna.sit.b2.f23621689.homework8.task1;

public class SciFiNovel extends Book {
    public SciFiNovel(String title, Author author, int publishingYear, double price, CoverType coverType) throws InvalidDataException {
        super(title, author, publishingYear, price, coverType);
    }

    public double calculateMargin() {
        return getCoverType() == CoverType.PAPERBACK ? 0.12 : 0.09;
    }

    public double getFinalPrice() {
        return getPrice() + getPrice() * calculateMargin();
    }
}
