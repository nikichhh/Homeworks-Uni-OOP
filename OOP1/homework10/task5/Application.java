package bg.tu_varna.sit.b2.f23621689.homework10.task5;

public class Application {
    public static void main(String[] args) {
        try {
            Teacher teacher = new Teacher("John Smith", AcademicPositions.Professor);

            Student student1 = new Student("Alice Brown", Course.FIRST);
            Student student2 = new Student("Bob Green", Course.FIRST);
            Student student3 = new Student("Charlie White", Course.FIRST);

            Student[] students = {student1, student2, student3};
            Discipline discipline = new Discipline("Mathematics", teacher, students);

            Exam exam = new Exam(discipline, students.length);

            exam.addControlPoints(0, 35);
            exam.addControlPoints(1, 30);
            exam.addControlPoints(2, 40);

            System.out.println("Discipline: " + discipline.getName());
            System.out.println("Teacher: " + discipline.getTeacher());
            exam.printStudentControlPoints();

            System.out.println("Total Control Points: " + exam.calculateTotalPoints());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
