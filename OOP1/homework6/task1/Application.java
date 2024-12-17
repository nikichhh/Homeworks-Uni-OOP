package bg.tu_varna.sit.b2.f23621689.homework6.task1;

public class Application {
    public static void main(String[] args) {
        Author author1 = new Author("John", "Doe", "USA");
        Author author2 = new Author("Jane", "Smith", "UK");

        Book crimeBook = new CrimeNovel("Crime Story", author1, 1995, 20.0, true);
        Book poetryBook = new PoetryBook("Poetry Collection", author2, 2010, 15.0, true);
        Book sciFiBook = new SciFiNovel("Sci-Fi Adventure", author1, 2005, 25.0, false);

        Book[] books = {crimeBook, poetryBook, sciFiBook};
        Bookstore bookstore = new Bookstore(books);

        System.out.println("Обща цена на книгите: " + bookstore.calculateTotalBookPrice());
        System.out.println("Средна цена на книгите: " + bookstore.calculateAverageBookPrice());
    }
}
