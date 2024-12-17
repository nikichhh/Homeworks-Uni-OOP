package bg.tu_varna.sit.b2.f23621689.homework6.task1;

public class CrimeNovel extends Book{

    public CrimeNovel(String title, Author author, int publishingYear, double price, boolean hasHardCover) {
        super(title, author, publishingYear, price, hasHardCover);
    }

    @Override
    public double calculateMargin() {
        if (hasHardCover()) {
            return getPrice() * 0.02;
        } else {
            return getPrice() * 0.01;
        }
    }
}
