package bg.tu_varna.sit.b2.f23621689.homework7.task1;

public class Author {
    private String firstName;
    private String lastName;
    private String country;

    public Author(String firstName, String lastName, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }
}
