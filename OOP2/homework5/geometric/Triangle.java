package bg.tu_varna.sit.b2.f23621689.homework5.geometric;

public class Triangle implements GeometricShape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public void drawShape(String name) {
        System.out.println("Drawing " + name + " triangle with sides: a=" + a + ", b=" + b + ", c=" + c);
    }
}
