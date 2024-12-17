package bg.tu_varna.sit.b2.f23621689.homework8.task1;

public abstract class Book implements Margin{
    private String title;
    private Author author;
    private int publishingYear;
    private double price;
    private CoverType coverType;

    public Book(String title, Author author, int publishingYear, double price, CoverType coverType) throws InvalidDataException {
        if (title == null || title.isEmpty() || price < 5 || author == null) {
            throw new InvalidDataException("Некоректни данни за книга!");
        }
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.price = price;
        this.coverType = coverType;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public abstract double getFinalPrice();

    public String toString() {
        return "Книга: " + title + ", Автор: " + author + ", Цена: " + price + ", Тип корица: " + coverType;
    }
}
