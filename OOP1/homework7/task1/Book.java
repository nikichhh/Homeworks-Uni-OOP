package bg.tu_varna.sit.b2.f23621689.homework7.task1;

public abstract class Book implements Margin {
    private String title;
    private Author author;
    private int publishingYear;
    private double price;
    private CoverType coverType;

    public Book(String title, Author author, int publishingYear, double price, CoverType coverType) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.price = price;
        this.coverType = coverType;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public double getPrice() {
        return price;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public double getFinalPrice() {
        return price + calculateMargin();
    }

    @Override
    public String toString() {
        return author + ": " + title;
    }
}
