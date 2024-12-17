package bg.tu_varna.sit.b2.f23621689.homework8.task1;

public class Application {
    public static void main(String[] args) {
        try {
            Author author1 = new Author("Иван", "Петров", "България");
            Author author2 = new Author("Джон", "Смит", "САЩ");

            Book crimeNovel = new CrimeNovel("Трилър", author1, 2021, 20, CoverType.HARDCOVER);
            Book poetryBook = new PoetryBook("Поезия", author2, 2019, 15, CoverType.PAPERBACK);
            Book sciFiNovel = new SciFiNovel("Наука", author1, 2022, 25, CoverType.PAPERBACK);

            Bookstore bookstore = new Bookstore(10);
            bookstore.addBook(crimeNovel);
            bookstore.addBook(poetryBook);
            bookstore.addBook(sciFiNovel);

            System.out.println(bookstore);
            System.out.println("Обща цена: " + bookstore.calculateTotalBookPrice());
            System.out.println("Средна цена: " + bookstore.calculateAverageBookPrice());
        } catch (InvalidDataException e) {
            System.out.println("Грешка: " + e.getMessage());
        }
    }
}
