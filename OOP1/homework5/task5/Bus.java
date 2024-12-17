package bg.tu_varna.sit.b2.f23621689.homework5.task5;

public class Bus extends Automobile {
    private int seats;
    private int courses;

    Bus(String brand, String model, int power, String engineType, String transmission, int yearOfManufacture, int seats) {
        super(brand, model, power, engineType, transmission, yearOfManufacture);
        this.seats = seats;
        this.courses = 0;
    }

    public boolean startup() {
        int maxCoursesPerDay = 10;
        int difference = courses % maxCoursesPerDay;

        return difference < 5;
    }

    public int getSeats() {
        return seats;
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }

    public void incrementCourses() {
        this.courses++;
    }

    public boolean isLimitExceeded() {
        double averageCoursesPerDay = courses / 1.0;
        return averageCoursesPerDay > 5;
    }
}

