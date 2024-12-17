package bg.tu_varna.sit.b2.f23621689.homework2.task4;

public class Faculty {
    StudentGroup[] studentGroups;

    public Faculty(StudentGroup[] studentGroups) {
        this.studentGroups = studentGroups;
    }

    public StudentGroup getGroupWithMaxStudentsByCourse(int course) {
        StudentGroup maxGroup = null;

        for (int i = 0; i < studentGroups.length; i++) {
            if (studentGroups[i].getCourse() == course) {
                if (maxGroup == null || studentGroups[i].getNumberOfStudents() > maxGroup.getNumberOfStudents()) {
                    maxGroup = studentGroups[i];
                }
            }
        }

        return maxGroup;
    }
}
