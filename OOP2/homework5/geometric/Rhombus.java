package bg.tu_varna.sit.b2.f23621689.homework5.geometric;

public class Rhombus implements GeometricShape {
    private double side;
    private double diag1;
    private double diag2;

    public Rhombus(double side, double diag1, double diag2) {
        this.side = side;
        this.diag1 = diag1;
        this.diag2 = diag2;
    }

    @Override
    public double area() {
        return (diag1 * diag2) / 2;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public void drawShape(String name) {
        System.out.println("Drawing " + name + " rhombus with side=" + side +
                ", diagonal1=" + diag1 + ", diagonal2=" + diag2);
    }
}
