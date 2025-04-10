package bg.tu_varna.sit.b2.f23621689.homework5.manager;
import bg.tu_varna.sit.b2.f23621689.homework5.shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeManager {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void drawAllShapes() {
        for (Shape shape : shapes) {
            if (!shape.isHide()) {
                shape.draw(shape.description());
            }
        }
    }

    public void resizeAllShapes(int factor) {
        for (Shape shape : shapes) {
            shape.resize(factor);
        }
    }
}
