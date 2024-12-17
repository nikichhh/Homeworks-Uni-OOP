package bg.tu_varna.sit.b2.f23621689.homework5.task1;

public class Application {
    public static void main(String[] args) {
    /* Код, ако ще се вкарват стойностите, чрез модификация при пускането на програмата
        if (args.length < 7) {
            System.out.println("Моля, въведете всички необходими параметри: име на град, пощенски код, номер на лична карта, година на издаване, ЕГН, първо име, второ име, трето име.");
            return;
        }

    Четене на входните данни от аргументите
        String cityName = args[0];
        int postalCode = Integer.parseInt(args[1]);
        String idNumber = args[2];
        int issueYear = Integer.parseInt(args[3]);
        String egn = args[4];
        String firstName = args[5];
        String secondName = args[6];
        String thirdName = args[7];

        City city = new City(cityName, postalCode);
        IdentificationCard idCard = new IdentificationCard(idNumber, issueYear, egn, city);
        Adult adult = new Adult(firstName, secondName, thirdName, idCard);
     */

        City city = new City("София", 1000);

        IdentificationCard idCard = new IdentificationCard("BG123456", 2020, "1234567890", city);

        Adult adult = new Adult("Иван", "Иванов", "Петров", idCard);

        System.out.println(adult.toString());
    }
}

