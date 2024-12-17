package bg.tu_varna.sit.b2.f23621689.homework9.task3;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) throws InvalidDataException {
        if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty() || age <= 0) {
            throw new InvalidDataException("Невалидни данни за човека!");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", Възраст: " + age;
    }
}
