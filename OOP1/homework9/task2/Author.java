package bg.tu_varna.sit.b2.f23621689.homework9.task2;

public class Author implements Comparable<Author> {
    private String firstName;
    private String lastName;
    private String country;

    public Author(String firstName, String lastName, String country) throws InvalidDataException {
        if (firstName == null || lastName == null || country == null || firstName.isEmpty() || lastName.isEmpty() || country.isEmpty()) {
            throw new InvalidDataException("Невалидни данни за автора!");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return firstName.equals(author.firstName) && lastName.equals(author.lastName) && country.equals(author.country);
    }

    @Override
    public int compareTo(Author other) {
        int lastNameComparison = lastName.compareTo(other.lastName);
        if (lastNameComparison != 0) return lastNameComparison;
        int firstNameComparison = firstName.compareTo(other.firstName);
        if (firstNameComparison != 0) return firstNameComparison;
        return country.compareTo(other.country);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + country + ")";
    }
}
