package bg.tu_varna.sit.b2.f23621689.homework3.task4;

public class Main {
    public static void main(String[] args) {
        StandardTicket standardTicket = new StandardTicket("Концерт", 50, false);
        System.out.println("Стандартен билет за: " + standardTicket.getPerformanceName() + ", Цена: " + standardTicket.getPrice());
        System.out.println("Използван ли е билета: " + standardTicket.isUsed());

        DiscountedTicket discountedTicket = new DiscountedTicket("Филм", 40, false, "Николай Георгиев");
        System.out.println("Намален билет за: " + discountedTicket.getPerformanceName() + ", Цена: " + discountedTicket.getPrice());
        System.out.println("Име на ползвателя: " + discountedTicket.getNameOfUser());

        GroupTicket groupTicket = new GroupTicket("Театър", 15);
        System.out.println("Групов билет за: " + groupTicket.getPerformanceName() + ", Цена: " + groupTicket.getPrice() + ", Хора: " + groupTicket.getNumberOfPeople());

        groupTicket.addUser();
        System.out.println("След добавяне на потребител: Цена: " + groupTicket.getPrice() + ", Хора: " + groupTicket.getNumberOfPeople());
    }
}
