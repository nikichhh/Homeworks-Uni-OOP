package bg.tu_varna.sit.b2.f23621689.homework5.shape;

public class Rectangle implements Shape {
    private String name;
    private boolean hidden;
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.name = "Rectangle";
        this.hidden = false;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(String name) {
        this.name = name;
        System.out.println("Drawing " + name + " rectangle with width=" + width + ", height=" + height);
    }

    @Override
    public void resize(int factor) {
        width *= factor;
        height *= factor;
        System.out.println("Resized rectangle to width=" + width + ", height=" + height);
    }

    @Override
    public String description() {
        return "Rectangle with width=" + width + ", height=" + height;
    }

    @Override
    public boolean isHide() {
        return hidden;
    }

    public void setHide(boolean hide) {
        this.hidden = hide;
    }
}