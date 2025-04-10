package bg.tu_varna.sit.b2.f23621689.homework5.shape;

public interface Shape {
    void draw(String name);
    void resize(int factor);
    String description();
    boolean isHide();
}
