package bg.tu_varna.sit.b2.f23621689.homework8.task1;

public class Bookstore {
    private Book[] books;
    private int count;

    public Bookstore(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        }
    }

    public double calculateTotalBookPrice() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += books[i].getFinalPrice();
        }
        return total;
    }

    public double calculateAverageBookPrice() {
        if (count == 0) return 0;
        return calculateTotalBookPrice() / count;
    }

    public String toString() {
        String result = "Книжарница:\n";
        for (int i = 0; i < count; i++) {
            result += books[i].toString() + "\n";
        }
        return result;
    }
}
