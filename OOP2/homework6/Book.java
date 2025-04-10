package bg.tu_varna.sit.b2.f23621689.homework6;

public abstract class Book {
    protected BookImplementation implementation;
    protected double basePrice;
    protected String summary;
    protected int pageCount;

    public Book(BookImplementation implementation, double basePrice, String summary, int pageCount) {
        this.implementation = implementation;
        this.basePrice = basePrice;
        this.summary = summary;
        this.pageCount = pageCount;
    }

    public abstract double getPrice();
    public abstract void display();

    public double getBasePrice() {
        return basePrice;
    }

    public String getSummary() {
        return summary;
    }

    public int getPageCount() {
        return pageCount;
    }
}
