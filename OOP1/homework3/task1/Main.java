package bg.tu_varna.sit.b2.f23621689.homework3.task1;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(150.50, 30);

        System.out.println("Цена на принтера: " + printer.getPrice());
        System.out.println("Брой страници: " + printer.getNumberOfPages());

        System.out.println("Принтиране на " + printer.getNumberOfPages() + " за 1 минута");

        printer.setPrice(200.00);
        printer.setNumberOfPages(50);

        System.out.println("Нова цена на принтера: " + printer.getPrice());
        System.out.println("Нов брой страници: " + printer.getNumberOfPages());

        System.out.println("Принтиране на " + printer.getNumberOfPages() + " за 1 минута");
    }
}
