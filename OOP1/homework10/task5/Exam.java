package bg.tu_varna.sit.b2.f23621689.homework10.task5;

public class Exam {
    private Discipline discipline;
    private int[] controlPoints;

    public Exam(Discipline discipline, int numberOfStudents) {
        this.discipline = discipline;
        this.controlPoints = new int[numberOfStudents];
    }

    public void addControlPoints(int studentIndex, int points) throws SemestrialControlException {
        if (points < 0 || points > 40) {
            throw new SemestrialControlException("Invalid semestrial control points!");
        }
        controlPoints[studentIndex] = points;
    }

    public int calculateTotalPoints() {
        int totalPoints = 0;
        for (int points : controlPoints) {
            totalPoints += points;
        }
        return totalPoints;
    }

    public void printStudentControlPoints() {
        Student[] students = discipline.getStudents();
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " - Control Points: " + controlPoints[i]);
        }
    }
}
