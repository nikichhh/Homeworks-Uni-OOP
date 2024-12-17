package bg.tu_varna.sit.b2.f23621689.homework6.task1;

public class PoetryBook extends Book{

    public PoetryBook(String title, Author author, int publishingYear, double price, boolean hasHardCover) {
        super(title, author, publishingYear, price, hasHardCover);
    }

    @Override
    public double calculateMargin() {
        if (hasHardCover() && getPublishingYear() > 2000) {
            return getPrice() * 0.01;
        } else {
            return getPrice() * 0.05;
        }
    }
}
