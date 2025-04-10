package bg.tu_varna.sit.b2.f23621689.homework5.shape;

public class Circle implements Shape {
    private String name;
    private boolean hidden;
    private int radius;

    public Circle(int radius) {
        this.name = "Circle";
        this.hidden = false;
        this.radius = radius;
    }

    @Override
    public void draw(String name) {
        this.name = name;
        System.out.println("Drawing " + name + " circle with radius=" + radius);
    }

    @Override
    public void resize(int factor) {
        radius *= factor;
        System.out.println("Resized circle to radius=" + radius);
    }

    @Override
    public String description() {
        return "Circle with radius=" + radius;
    }

    @Override
    public boolean isHide() {
        return hidden;
    }

    public void setHide(boolean hide) {
        this.hidden = hide;
    }
}
