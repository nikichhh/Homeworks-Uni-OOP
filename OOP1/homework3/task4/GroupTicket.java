package bg.tu_varna.sit.b2.f23621689.homework3.task4;

public class GroupTicket extends Ticket{
    private int numberOfPeople;
    private static final int MAX_PEOPLE = 20;

    public GroupTicket(String performanceName, double price) {
        super(performanceName, price * 20);
        this.numberOfPeople = 0;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void addUser() {
        if (numberOfPeople < MAX_PEOPLE) {
            numberOfPeople++;
            this.price -= 2;
            return;
        }

        System.out.println("Достигнат е лимит от 20 човека");
    }
}
