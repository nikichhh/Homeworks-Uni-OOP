package bg.tu_varna.sit.b2.f23621689.homework9.task2;

public class Book implements Comparable<Book> {
    private String title;
    private Author author;
    private int publishingYear;
    private int availableQuantity;

    public Book(String title, Author author, int publishingYear, int availableQuantity) throws InvalidDataException {
        if (title == null || title.isEmpty() || author == null || publishingYear <= 0 || availableQuantity < 0) {
            throw new InvalidDataException("Невалидни данни за книгата!");
        }
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.availableQuantity = availableQuantity;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int quantity) {
        this.availableQuantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int compareTo(Book other) {
        int authorComparison = author.compareTo(other.author);
        if (authorComparison != 0) return authorComparison;
        return title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return "\"" + title + "\" от " + author + ", Година на издаване: " + publishingYear + ", Наличност: " + availableQuantity;
    }
}
