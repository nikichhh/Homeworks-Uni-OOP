package bg.tu_varna.sit.b2.f23621689.homework9.task5;

public class Bank {
    private String name;
    private Account[] accounts;
    private int count;

    public Bank(String name, int capacity) {
        this.name = name;
        this.accounts = new Account[capacity];
        this.count = 0;
    }

    public void createAccount(Account account) {
        if (count < accounts.length) {
            accounts[count++] = account;
        }
    }

    public void closeAccount(String id) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].toString().contains(id)) {
                accounts[i] = accounts[--count];
                accounts[count] = null;
                break;
            }
        }
    }

    public int calculateNumberOfSalaryAccounts() {
        int salaryAccounts = 0;
        for (int i = 0; i < count; i++) {
            if (accounts[i] instanceof SalaryAccount) {
                salaryAccounts++;
            }
        }
        return salaryAccounts;
    }

    public double calculateAverageInterestByCurrency(Currency currency) {
        double totalInterest = 0;
        int relevantAccounts = 0;

        for (int i = 0; i < count; i++) {
            if (accounts[i].getCurrency() == currency) {
                totalInterest += accounts[i].calculateInterestValue();
                relevantAccounts++;
            }
        }
        return relevantAccounts > 0 ? totalInterest / relevantAccounts : 0;
    }

    public Account findHighestInterest() {
        Account maxAccount = null;
        double maxInterest = 0;

        for (int i = 0; i < count; i++) {
            double interest = accounts[i].calculateInterestValue();
            if (interest > maxInterest) {
                maxInterest = interest;
                maxAccount = accounts[i];
            }
        }
        return maxAccount;
    }

    public String toString() {
        String result = "Банка: " + name + "\n";
        for (int i = 0; i < count; i++) {
            result += accounts[i] + "\n";
        }
        return result;
    }
}
