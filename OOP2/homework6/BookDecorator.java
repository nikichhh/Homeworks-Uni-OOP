package bg.tu_varna.sit.b2.f23621689.homework6;

public abstract class BookDecorator extends Book{
    protected Book book;

    public BookDecorator(Book book) {
        super(book.implementation, book.basePrice, book.summary, book.pageCount);
        this.book = book;
    }

    @Override
    public double getPrice() {
        return book.getPrice();
    }

    @Override
    public void display() {
        book.display();
    }
}
