package bg.tu_varna.sit.b2.f23621689.homework5.adapter;

import bg.tu_varna.sit.b2.f23621689.homework5.geometric.GeometricShape;
import bg.tu_varna.sit.b2.f23621689.homework5.shape.Shape;

public class GeometricShapeAdapter implements Shape {
    private GeometricShape geometricShape;
    private String name;
    private boolean hidden;

    public GeometricShapeAdapter(GeometricShape geometricShape) {
        this.geometricShape = geometricShape;
        this.name = "Adapted Shape";
        this.hidden = false;
    }

    @Override
    public void draw(String name) {
        this.name = name;
        geometricShape.drawShape(name);
    }

    @Override
    public void resize(int factor) {
        System.out.println("Resize operation not supported for this geometric shape");
    }

    @Override
    public String description() {
        return "Geometric shape with area=" + geometricShape.area() +
                ", perimeter=" + geometricShape.perimeter();
    }

    @Override
    public boolean isHide() {
        return hidden;
    }

    public void setHide(boolean hide) {
        this.hidden = hide;
    }
}
