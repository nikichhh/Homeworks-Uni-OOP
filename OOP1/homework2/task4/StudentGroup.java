package bg.tu_varna.sit.b2.f23621689.homework2.task4;

public class StudentGroup {
    String specialty;
    int course;
    int group;
    int numberOfStudents;

    public StudentGroup(String specialty, int course, int group, int numberOfStudents) {
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.numberOfStudents = numberOfStudents;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String toString() {
        return specialty + ", " + course + ", " + group + ", " + numberOfStudents;
    }
}
