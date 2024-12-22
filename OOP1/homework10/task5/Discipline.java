package bg.tu_varna.sit.b2.f23621689.homework10.task5;

public class Discipline {
    private String name;
    private Teacher teacher;
    private Student[] students;

    public Discipline(String name, Teacher teacher, Student[] students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Student[] getStudents() {
        return students;
    }
}
