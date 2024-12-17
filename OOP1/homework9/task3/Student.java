package bg.tu_varna.sit.b2.f23621689.homework9.task3;

public class Student extends Person implements Comparable<Student> {
    private String fNumber;
    private Speciality speciality;
    private int course;
    private double grades;

    public Student(String firstName, String lastName, int age, String fNumber, Speciality speciality, int course, double grades)
            throws InvalidDataException {
        super(firstName, lastName, age);
        if (fNumber == null || fNumber.isEmpty() || course <= 0 || grades < 0 || grades > 6) {
            throw new InvalidDataException("Невалидни данни за студента!");
        }
        this.fNumber = fNumber;
        this.speciality = speciality;
        this.course = course;
        this.grades = grades;
    }

    public String getFNumber() {
        return fNumber;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public int getCourse() {
        return course;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) throws InvalidDataException {
        if (grades < 0 || grades > 6) {
            throw new InvalidDataException("Оценката трябва да е между 0 и 6!");
        }
        this.grades = grades;
    }

    @Override
    public int compareTo(Student other) {
        return this.fNumber.compareTo(other.fNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return fNumber.equals(student.fNumber);
    }

    @Override
    public String toString() {
        return super.toString() + ", Факултетен номер: " + fNumber + ", Специалност: " + speciality + ", Курс: " + course + ", Оценка: " + grades;
    }
}
