package bg.tu_varna.sit.b2.f23621689.homework6;

public class PhysicalBook implements BookImplementation{
    private String coverType;
    private int weight;

    public PhysicalBook(String coverType, int weight) {
        this.coverType = coverType;
        this.weight = weight;
    }

    @Override
    public void display() {
        System.out.println("Физическа книга с " + coverType + " корица");
        System.out.println("Тегло: " + weight + " грама");
    }
}
