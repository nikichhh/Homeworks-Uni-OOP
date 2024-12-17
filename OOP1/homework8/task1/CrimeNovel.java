package bg.tu_varna.sit.b2.f23621689.homework8.task1;

public class CrimeNovel extends Book {
    public CrimeNovel(String title, Author author, int publishingYear, double price, CoverType coverType) throws InvalidDataException {
        super(title, author, publishingYear, price, coverType);
    }

    public double calculateMargin() {
        return getCoverType() == CoverType.HARDCOVER ? 0.02 : 0.01;
    }

    public double getFinalPrice() {
        return getPrice() + getPrice() * calculateMargin();
    }
}
