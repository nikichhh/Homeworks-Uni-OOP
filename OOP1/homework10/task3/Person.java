package bg.tu_varna.sit.b2.f23621674.homework9.task3;

public class Person implements Competency {
    private String egn;
    private String firstName;
    private String lastName;
    private int age;

    public Person(String egn, String firstName, String lastName, int age) throws InvalidDataException {
        if (egn == null || egn.length() != 10 || firstName == null || firstName.isEmpty()
                || lastName == null || lastName.isEmpty() || age < 0) {
            throw new InvalidDataException("Invalid person data!");
        }
        this.egn = egn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getEgn() {
        return egn;
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
    public boolean hasCompetence() {
        return age >= 18;
    }

    @Override
    public String toString() {
        return String.format("EGN: %s, Name: %s %s, Age: %d", egn, firstName, lastName, age);
    }
}
