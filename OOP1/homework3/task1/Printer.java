package bg.tu_varna.sit.b2.f23621689.homework3.task1;

public class Printer extends Machine{
    private int numberOfPages;

    public Printer(double price, int numberOfPages) {
        super(price);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
