package bg.tu_varna.sit.b2.f23621689.homework3.task4;

public class DiscountedTicket extends StandardTicket{
    private String nameOfUser;

    public DiscountedTicket(String performanceName, double price, boolean used, String nameOfUser) {
        super(performanceName, price * 0.5, used);
        this.nameOfUser = nameOfUser;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }
}
