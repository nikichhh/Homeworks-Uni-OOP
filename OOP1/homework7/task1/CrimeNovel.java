package bg.tu_varna.sit.b2.f23621689.homework7.task1;

public class CrimeNovel extends Book {
    public CrimeNovel(String title, Author author, int publishingYear, double price, CoverType coverType) {
        super(title, author, publishingYear, price, coverType);
    }

    @Override
    public double calculateMargin() {
        if (getCoverType() == CoverType.HARDCOVER) {
            return getPrice() * 0.02;
        } else {
            return getPrice() * 0.01;
        }
    }
}
