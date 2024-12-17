package bg.tu_varna.sit.b2.f23621689.homework3.task3;

public class Main {
    public static void main(String[] args) {
        City city = new City("Варна", 9000);

        IdentificationCard idCard = new IdentificationCard("1234567890", 2020, "1234567890", city);

        Adult adult = new Adult("Николай", "Веселинов", "Георгиев", idCard);

        System.out.println(adult.getPersonalInformation());
    }
}
