package bg.tu_varna.sit.b2.f23621689.homework7.task1;

public class SciFiNovel extends Book {
    public SciFiNovel(String title, Author author, int publishingYear, double price, CoverType coverType) {
        super(title, author, publishingYear, price, coverType);
    }

    @Override
    public double calculateMargin() {
        if (getCoverType() == CoverType.PAPERBACK) {
            return getPrice() * 0.09;
        } else {
            return getPrice() * 0.12;
        }
    }
}
