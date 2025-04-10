package bg.tu_varna.sit.b2.f23621689.homework6;

public class Application {
    public static void main(String[] args) {
        Book ebook = new StandardBook(new EBook(), 20.0, "Интересна книга за програмиране", 300);
        ebook.display();
        System.out.println("------------------------------");

        Book softcoverBook = new SoftcoverDecorator(
                new StandardBook(new PhysicalBook("мека", 300), 25.0, "Приключенски роман", 250),
                150
        );
        softcoverBook.display();
        System.out.println("------------------------------");

        Book hardcoverBook = new HardcoverDecorator(
                new StandardBook(new PhysicalBook("твърда", 450), 30.0, "Исторически роман", 400),
                "кожена", 200
        );
        hardcoverBook.display();
        System.out.println("------------------------------");

        Book comboBook = new HardcoverDecorator(
                new SoftcoverDecorator(
                        new StandardBook(new PhysicalBook("комбинирана", 500), 35.0, "Фантастичен роман", 350),
                        150
                ),
                "хартиена", 100
        );
        comboBook.display();
    }
}
