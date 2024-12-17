package bg.tu_varna.sit.b2.f23621689.homework2.task3;

public class Account {
    int accountNumber;
    String currency;
    double balance;

    public Account(int accountNumber, String currency, double balance) {
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }
}
