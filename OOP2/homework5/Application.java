package bg.tu_varna.sit.b2.f23621689.homework5;

import bg.tu_varna.sit.b2.f23621689.homework5.adapter.GeometricShapeAdapter;
import bg.tu_varna.sit.b2.f23621689.homework5.geometric.GeometricShape;
import bg.tu_varna.sit.b2.f23621689.homework5.geometric.Rhombus;
import bg.tu_varna.sit.b2.f23621689.homework5.geometric.Triangle;
import bg.tu_varna.sit.b2.f23621689.homework5.manager.ShapeManager;
import bg.tu_varna.sit.b2.f23621689.homework5.shape.Circle;
import bg.tu_varna.sit.b2.f23621689.homework5.shape.Rectangle;
import bg.tu_varna.sit.b2.f23621689.homework5.shape.Shape;

public class Application {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        Shape circle = new Circle(15);

        GeometricShape triangle = new Triangle(3, 4, 5);
        GeometricShape rhombus = new Rhombus(5, 8, 6);

        Shape triangleAdapter = new GeometricShapeAdapter(triangle);
        Shape rhombusAdapter = new GeometricShapeAdapter(rhombus);

        ShapeManager manager = new ShapeManager();
        manager.addShape(rectangle);
        manager.addShape(circle);
        manager.addShape(triangleAdapter);
        manager.addShape(rhombusAdapter);

        System.out.println("Drawing all shapes:");
        manager.drawAllShapes();

        System.out.println("\nResizing all shapes (factor = 2):");
        manager.resizeAllShapes(2);

        System.out.println("\nDrawing all shapes after resize:");
        manager.drawAllShapes();
    }
}
