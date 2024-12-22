package bg.tu_varna.sit.b2.f23621689.homework10.task2;

public class SavingsAccount extends Account {
    public SavingsAccount(String id, AccountType type, Currency currency, double balance) throws InvalidDataException {
        super(id, type, currency, balance);
    }

    @Override
    public double calculateInterestValue() {
        double interestRate = switch (getCurrency()) {
            case BGN -> 0.15;
            case USD -> 0.10;
            case EUR -> 0.05;
            default -> 0.01;
        };
        return getBalance() * interestRate;
    }
}
