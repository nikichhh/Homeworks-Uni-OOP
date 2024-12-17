package bg.tu_varna.sit.b2.f23621689.homework9.task2;

public class BookCatalogue {
    private Book[] books;
    private int bookCount;

    public BookCatalogue(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].equals(book)) {
                return;
            }
        }
        if (bookCount < books.length) {
            books[bookCount++] = book;
        }
    }

    public void removeBook(Book book) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].equals(book)) {
                books[i] = books[--bookCount];
                books[bookCount] = null;
                return;
            }
        }
    }

    public boolean borrowBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title) && books[i].getAvailableQuantity() > 0) {
                books[i].setAvailableQuantity(books[i].getAvailableQuantity() - 1);
                return true;
            }
        }
        return false;
    }

    public void returnBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                books[i].setAvailableQuantity(books[i].getAvailableQuantity() + 1);
                return;
            }
        }
    }

    public int countBooksByAuthor(Author author) {
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getAuthor().equals(author)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Каталог с книги:\n");
        for (int i = 0; i < bookCount; i++) {
            sb.append(books[i]).append("\n");
        }
        return sb.toString();
    }
}
