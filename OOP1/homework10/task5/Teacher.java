package bg.tu_varna.sit.b2.f23621689.homework10.task5;

public class Teacher extends Person {
    private AcademicPositions position;

    public Teacher(String name, AcademicPositions position) throws PersonException {
        super(name);
        this.position = position;
    }

    public AcademicPositions getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return getName() + " (" + position + ")";
    }
}
