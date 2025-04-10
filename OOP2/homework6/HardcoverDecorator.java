package bg.tu_varna.sit.b2.f23621689.homework6;

public class HardcoverDecorator extends BookDecorator{
    private String bindingType;
    private int additionalWeight;

    public HardcoverDecorator(Book book, String bindingType, int additionalWeight) {
        super(book);
        this.bindingType = bindingType;
        this.additionalWeight = additionalWeight;
    }

    @Override
    public double getPrice() {
        return book.getPrice() + 15.0;
    }

    @Override
    public void display() {
        book.display();
        System.out.println("Добавена твърда корица тип: " + bindingType);
        System.out.println("Допълнително тегло: " + additionalWeight + " грама");
        System.out.println("Крайна цена: " + getPrice());
    }
}
