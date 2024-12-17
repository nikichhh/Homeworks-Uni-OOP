package bg.tu_varna.sit.b2.f23621689.homework2.task4;

public class Application {
    public static void main(String[] args) {
        StudentGroup group1 = new StudentGroup("Computer Science", 1, 101, 30);
        StudentGroup group2 = new StudentGroup("Computer Science", 2, 201, 40);
        StudentGroup group3 = new StudentGroup("Mathematics", 2, 202, 35);

        StudentGroup[] groups = {group1, group2, group3};

        Faculty faculty = new Faculty(groups);
        System.out.println(group1);
        System.out.println(group2);
        System.out.println(group3);

        StudentGroup maxGroup = faculty.getGroupWithMaxStudentsByCourse(2);
        if (maxGroup != null) {
            System.out.println("Group with maximum students in course 2:");
            System.out.println(maxGroup);
        } else {
            System.out.println("No groups found for course 2.");
        }
    }
}
