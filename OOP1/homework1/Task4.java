package bg.tu_varna.sit.b2.f23621689.homework1;

public class Task4 {
    public static void main(String[] args) {
        int[] facultyNumbers = {2365487, 2398654, 2212365, 2223478, 2189057, 2142323, 2032178, 2576812, 1964590, 1942365};
        int firstYears = 0, secondYears = 0, thirdYears = 0, fourthYears = 0, invalid = 0;

        for (int i = 0; i < facultyNumbers.length; i++) {
            int year = facultyNumbers[i] / 100_000;

            if (year == 23){
                firstYears++;
            }
            else if (year == 22) {
                secondYears++;
            }
            else if (year == 21) {
                thirdYears++;
            }
            else if (year == 20) {
                fourthYears++;
            }
            else {
                invalid++;
            }
        }

        System.out.println("Студентите първа година са " + firstYears + " на брой.");
        System.out.println("Студентите втора година са " + secondYears + " на брой.");
        System.out.println("Студентите трета година са " + thirdYears + " на брой.");
        System.out.println("Студентите четвърта година са " + fourthYears + " на брой.");
        System.out.println("Невалидните факултетни номера са " + invalid + " на брой.");
    }
}
