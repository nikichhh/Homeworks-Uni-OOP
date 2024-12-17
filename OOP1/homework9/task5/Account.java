package bg.tu_varna.sit.b2.f23621689.homework9.task5;

public abstract class Account implements InterestCalculator {
    private String id;
    private AccountType type;
    private Currency currency;
    private double balance;

    public Account(String id, AccountType type, Currency currency, double balance) throws InvalidDataException {
        if(id == null || id.isEmpty() || balance < 0) {
            throw new InvalidDataException("Невалидни данни за сметката!");
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

    @Override
    public String toString() {
        return "Сметка: " + id + ", Тип: " + type + ", Валута: " + currency + ", Наличност: " + balance;
    }
}
