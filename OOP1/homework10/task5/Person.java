package bg.tu_varna.sit.b2.f23621674.homework9.task5;

public abstract class Person {
    private String name;

    public Person(String name) throws PersonException {
        if (!isValidName(name)) {
            throw new PersonException("Invalid value for Person name!");
        }
        this.name = name;
    }

    private boolean isValidName(String name) {
        String[] parts = name.split(" ");
        return parts.length >= 2 && Character.isUpperCase(parts[0].charAt(0)) && Character.isUpperCase(parts[1].charAt(0));
    }

    public String getName() {
        return name;
    }
}
