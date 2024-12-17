package bg.tu_varna.sit.b2.f23621689.homework3.task4;

public class StandardTicket extends Ticket{
    private boolean used;

    public StandardTicket(String performanceName, double price, boolean used) {
        super(performanceName, price);
        this.used = used;
    }

    public boolean isUsed() {
        return used;
    }
}
