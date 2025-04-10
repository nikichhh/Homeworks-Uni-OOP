package bg.tu_varna.sit.b2.f23621689.homework6;

public class SoftcoverDecorator extends BookDecorator{
    private int weight;

    public SoftcoverDecorator(Book book, int weight) {
        super(book);
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return book.getPrice() + 5.0;
    }

    @Override
    public void display() {
        book.display();
        System.out.println("Добавена мека корица");
        System.out.println("Тегло на корицата: " + weight + " грама");
        System.out.println("Крайна цена: " + getPrice());
    }
}
