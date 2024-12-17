package bg.tu_varna.sit.b2.f23621689.homework5.task4;

public class GroupTicket extends Ticket {
    int userCount;
    int currentUserCount;

    GroupTicket(String performanceName, double pricePerUser) {
        super(performanceName, pricePerUser);
        this.userCount = 20;
        this.currentUserCount = 0;
    }

    void addUser() {
        if (currentUserCount < userCount) {
            currentUserCount++;
        }
    }

    double getPrice() {
        double totalPrice = price * userCount;
        double discount = currentUserCount * price * 0.10;
        return totalPrice - discount;
    }

    int getCurrentUserCount() {
        return currentUserCount;
    }
}
