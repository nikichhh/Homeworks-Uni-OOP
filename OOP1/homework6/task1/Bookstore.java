package bg.tu_varna.sit.b2.f23621689.homework6.task1;

public class Bookstore {
    private Book[] books;

    public Bookstore(Book[] books) {
        this.books = books;
    }

    public double calculateTotalBookPrice() {
        double total = 0;

        for (Book book : books) {
            total += book.getFinalPrice();
        }

        return total;
    }

    public double calculateAverageBookPrice() {
        if (books.length == 0) {
            return 0;
        }

        return calculateTotalBookPrice() / books.length;
    }
}
