package bg.tu_varna.sit.b2.f23621689.homework9.task3;

public class Application {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Иван", "Иванов", 20, "F12345", Speciality.SIT, 1, 5.5);
            Student s2 = new Student("Мария", "Петрова", 21, "F12346", Speciality.KCT, 2, 6.0);
            Student s3 = new Student("Георги", "Димитров", 22, "F12347", Speciality.SIT, 3, 4.8);

            Faculty faculty = new Faculty("Компютърни науки", 10);
            faculty.addStudent(s1);
            faculty.addStudent(s2);
            faculty.addStudent(s3);

            System.out.println(faculty);
            System.out.println("Среден успех: " + faculty.calculateAverageGrades());
            System.out.println("Брой студенти със специалност SIT: " + faculty.getNumberOfStudentsBySpeciality(Speciality.SIT));
            System.out.println("Брой студенти в курс 2: " + faculty.getNumberOfStudentsByCourse(2));
            System.out.println("Студенти с отличен успех:");
            for (Student student : faculty.getStudentsWithExcellentGrades()) {
                System.out.println(student);
            }

        } catch (InvalidDataException e) {
            System.out.println("Грешка: " + e.getMessage());
        }
    }
}
