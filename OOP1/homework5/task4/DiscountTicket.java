package bg.tu_varna.sit.b2.f23621689.homework5.task4;

public class DiscountTicket extends StandardTicket {
    String userName;

    DiscountTicket(String performanceName, double price, String userName) {
        super(performanceName, price);
        this.userName = userName;
    }

    double getPrice() {
        return price * 0.5;
    }

    String getUserName() {
        return userName;
    }
}
