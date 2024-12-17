package bg.tu_varna.sit.b2.f23621689.homework9.task3;

public class Faculty {
    private String facultyName;
    private Student[] students;
    private int studentCount;

    public Faculty(String facultyName, int capacity) throws InvalidDataException {
        if (facultyName == null || facultyName.isEmpty() || capacity <= 0) {
            throw new InvalidDataException("Невалидни данни за факултета!");
        }
        this.facultyName = facultyName;
        this.students = new Student[capacity];
        this.studentCount = 0;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        }
    }

    public double calculateAverageGrades() {
        double totalGrades = 0;
        for (int i = 0; i < studentCount; i++) {
            totalGrades += students[i].getGrades();
        }
        return studentCount > 0 ? totalGrades / studentCount : 0;
    }

    public int getNumberOfStudentsBySpeciality(Speciality speciality) {
        int count = 0;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getSpeciality() == speciality) {
                count++;
            }
        }
        return count;
    }

    public Student[] getStudentsWithExcellentGrades() {
        int count = 0;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getGrades() == 6) {
                count++;
            }
        }
        Student[] excellentStudents = new Student[count];
        int index = 0;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getGrades() == 6) {
                excellentStudents[index++] = students[i];
            }
        }
        return excellentStudents;
    }

    public int getNumberOfStudentsByCourse(int course) {
        int count = 0;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getCourse() == course) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Факултет: " + facultyName + "\nСтуденти:\n");
        for (int i = 0; i < studentCount; i++) {
            sb.append(students[i]).append("\n");
        }
        return sb.toString();
    }
}
