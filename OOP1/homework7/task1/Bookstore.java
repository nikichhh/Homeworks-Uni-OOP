package bg.tu_varna.sit.b2.f23621689.homework7.task1;

public class Bookstore {
    private Book[] books;
    private int count;

    public Bookstore(Book[] books) {
        this.books = books;
        this.count = books.length;
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

    public void printBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i] + " - Final Price: " + books[i].getFinalPrice());
        }
    }
}
