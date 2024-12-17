package bg.tu_varna.sit.b2.f23621689.homework9.task2;

public class Application {
    public static void main(String[] args) {
        try {
            Author author1 = new Author("Иван", "Вазов", "България");
            Author author2 = new Author("Джон", "Смит", "Англия");

            Book book1 = new Book("Под игото", author1, 1894, 5);
            Book book2 = new Book("Записки по българските въстания", author1, 1883, 3);
            Book book3 = new Book("История на Англия", author2, 1999, 10);

            BookCatalogue catalogue = new BookCatalogue(10);
            catalogue.addBook(book1);
            catalogue.addBook(book2);
            catalogue.addBook(book3);

            System.out.println(catalogue);

            System.out.println("Вземаме книга: Под игото");
            catalogue.borrowBook("Под игото");
            System.out.println(catalogue);

            System.out.println("Връщаме книга: Под игото");
            catalogue.returnBook("Под игото");
            System.out.println(catalogue);

            System.out.println("Брой книги на Иван Вазов: " + catalogue.countBooksByAuthor(author1));

        } catch (InvalidDataException e) {
            System.out.println("Грешка: " + e.getMessage());
        }
    }
}
