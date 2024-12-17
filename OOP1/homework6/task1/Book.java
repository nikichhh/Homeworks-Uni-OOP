package bg.tu_varna.sit.b2.f23621689.homework6.task1;

public abstract class Book implements Margin{
    private String title;
    private Author author;
    private int publishingYear;
    private double price;
    private boolean hasHardCover;

    public Book(String title, Author author, int publishingYear, double price, boolean hasHardCover) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.price = price;
        this.hasHardCover = hasHardCover;
    }

    public double getFinalPrice() {
        return price + calculateMargin();
    }

    @Override
    public String toString() {
        return author.toString() + ": " + title;
    }

    public double getPrice() {
        return price;
    }

    public boolean hasHardCover() {
        return hasHardCover;
    }

    public int getPublishingYear() {
        return publishingYear;
    }
}
