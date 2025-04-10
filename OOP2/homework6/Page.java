package bg.tu_varna.sit.b2.f23621689.homework6;

public class Page {
    private int number;
    private String text;

    public Page(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public void display() {
        System.out.println("Страница " + number + ": " + text);
    }
}
