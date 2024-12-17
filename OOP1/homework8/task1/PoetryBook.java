package bg.tu_varna.sit.b2.f23621689.homework8.task1;

public class PoetryBook extends Book {
    public PoetryBook(String title, Author author, int publishingYear, double price, CoverType coverType) throws InvalidDataException {
        super(title, author, publishingYear, price, coverType);
    }

    public double calculateMargin() {
        return getCoverType() == CoverType.HARDCOVER ? 0.10 : 0.05;
    }

    public double getFinalPrice() {
        return getPrice() + getPrice() * calculateMargin();
    }
}
