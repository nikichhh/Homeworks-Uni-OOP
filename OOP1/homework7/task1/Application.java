package bg.tu_varna.sit.b2.f23621689.homework7.task1;

public class Application {
    public static void main(String[] args) {
        Author author1 = new Author("Agatha", "Christie", "UK");
        Author author2 = new Author("Robert", "Frost", "USA");
        Author author3 = new Author("Isaac", "Asimov", "USA");

        Book crimeNovel = new CrimeNovel("Murder on the Orient Express", author1, 1934, 20, CoverType.HARDCOVER);
        Book poetryBook = new PoetryBook("The Road Not Taken", author2, 1916, 15, CoverType.PAPERBACK);
        Book sciFiNovel = new SciFiNovel("Foundation", author3, 1951, 25, CoverType.PAPERBACK);

        Bookstore bookstore = new Bookstore(new Book[] {crimeNovel, poetryBook, sciFiNovel});

        bookstore.printBooks();
        System.out.println("Total Price: " + bookstore.calculateTotalBookPrice());
        System.out.println("Average Price: " + bookstore.calculateAverageBookPrice());
    }
}
