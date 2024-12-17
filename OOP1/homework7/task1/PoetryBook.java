package bg.tu_varna.sit.b2.f23621689.homework7.task1;

public class PoetryBook extends Book {
    public PoetryBook(String title, Author author, int publishingYear, double price, CoverType coverType) {
        super(title, author, publishingYear, price, coverType);
    }

    @Override
    public double calculateMargin() {
        if (getCoverType() == CoverType.HARDCOVER && getPublishingYear() > 2000) {
            return getPrice() * 0.01;
        } else {
            return getPrice() * 0.05;
        }
    }
}
