package bg.tu_varna.sit.b2.f23621689.homework5.task1;

public class Person {
    private String firstName;
    private String secondName;
    private String thirdName;

    public Person(String firstName, String secondName, String thirdName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    @Override
    public String toString() {
        return thirdName + ", " + firstName + " " + secondName;
    }
}
