package bg.tu_varna.sit.b2.f23621689.homework3.task5;

public class Bus extends Car{
    private int numberOfSeats;
    private int coursesTraveled;

    public Bus(String brand, String model, int power, String engingeType, String gearboxType, int yearOfManifacture, String color, int numberOfSeats, int coursesTraveled) {
        super(brand, model, power, engingeType, gearboxType, yearOfManifacture, color);
        this.numberOfSeats = numberOfSeats;
        this.coursesTraveled = coursesTraveled;
    }

    public Bus(String brand, String model, int power, String engingeType, String gearboxType, int yearOfManifacture, int numberOfSeats, int coursesTraveled) {
        super(brand, model, power, engingeType, gearboxType, yearOfManifacture);
        this.numberOfSeats = numberOfSeats;
        this.coursesTraveled = coursesTraveled;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getCoursesTraveled() {
        return coursesTraveled;
    }

    public void incrementCourses() {
        this.coursesTraveled++;
    }

    public boolean isLimitExceeded() {
        return coursesTraveled - 10 > 5;
    }
}
