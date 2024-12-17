package bg.tu_varna.sit.b2.f23621689.homework5.task4;

public class Application {
    public static void main(String[] args) {
        Ticket standardTicket = new StandardTicket("Концерт", 50);
        System.out.println("Стандартен билет за: " + standardTicket.getPerformanceName() + ", Цена: " + standardTicket.getPrice());

        Ticket discountedTicket = new DiscountTicket("Филм", 40, "Иван Иванов");
        System.out.println("Билет с намаление за: " + discountedTicket.getPerformanceName() + ", Цена: " + discountedTicket.getPrice());

        GroupTicket groupTicket = new GroupTicket("Театър", 15);
        System.out.println("Групов билет за: " + groupTicket.getPerformanceName() + ", Начална цена: " + groupTicket.getPrice());

        for (int i = 0; i < 15; i++) {
            groupTicket.addUser();
        }

        System.out.println("Цена на груповия билет след добавяне на зрители: " + groupTicket.getPrice());
    }
}
