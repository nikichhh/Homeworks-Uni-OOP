package bg.tu_varna.sit.b2.f23621689.homework6;

public class StandardBook extends Book{
    public StandardBook(BookImplementation implementation, double basePrice, String summary, int pageCount) {
        super(implementation, basePrice, summary, pageCount);
    }

    @Override
    public double getPrice() {
        return basePrice;
    }

    @Override
    public void display() {
        System.out.println("Стандартна книга:");
        System.out.println("Резюме: " + summary);
        System.out.println("Брой страници: " + pageCount);
        System.out.println("Базова цена: " + basePrice);
        implementation.display();
    }
}
