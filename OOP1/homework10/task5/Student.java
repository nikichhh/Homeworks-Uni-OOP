package bg.tu_varna.sit.b2.f23621674.homework9.task5;

public class Student extends Person {
    private Course course;

    public Student(String name, Course course) throws PersonException {
        super(name);
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return getName() + " (" + course + ")";
    }
}
