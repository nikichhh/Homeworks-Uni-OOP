package bg.tu_varna.sit.b2.f23621689.homework2.task3;

public class Bank {
    Account[] accounts;

    public Bank(Account[] accounts) {
        this.accounts = accounts;
    }

    double calculateAverageBalanceByCurrency(String currency) {
        double totalBalance = 0.0;
        int count = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getCurrency().equalsIgnoreCase(currency)) {
                totalBalance += accounts[i].getBalance();
                count++;
            }
        }
        if (count > 0) {
            return totalBalance / count;
        } else {
            return 0.0;
        }
    }
}
