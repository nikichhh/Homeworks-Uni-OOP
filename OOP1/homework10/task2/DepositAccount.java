package bg.tu_varna.sit.b2.f23621689.homework10.task2;

public class DepositAccount extends Account {
    public DepositAccount(String id, AccountType type, Currency currency, double balance) throws InvalidDataException {
        super(id, type, currency, balance);
    }

    @Override
    public double calculateInterestValue() {
        double interestRate = switch (getCurrency()) {
            case BGN -> 0.09;
            case USD -> 0.07;
            case EUR -> 0.05;
            default -> 0.02;
        };
        return getBalance() * interestRate;
    }
}
