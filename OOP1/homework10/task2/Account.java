package bg.tu_varna.sit.b2.f23621674.homework9.task2;

public abstract class Account implements InterestCalculator {
    private String id;
    private AccountType type;
    private Currency currency;
    private double balance;

    public Account(String id, AccountType type, Currency currency, double balance) throws InvalidDataException {
        if (id == null || id.isEmpty() || balance < 0) {
            throw new InvalidDataException("Invalid account data!");
        }
        this.id = id;
        this.type = type;
        this.currency = currency;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public AccountType getType() {
        return type;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("Account ID: %s, Type: %s, Currency: %s, Balance: %.2f",
                id, type, currency, balance);
    }
}
