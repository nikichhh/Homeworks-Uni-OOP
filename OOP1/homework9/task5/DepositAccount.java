package bg.tu_varna.sit.b2.f23621689.homework9.task5;

public class DepositAccount extends Account {
    public DepositAccount(String id, AccountType type, Currency currency, double balance) throws InvalidDataException {
        super(id, type, currency, balance);
    }

    @Override
    public double calculateInterestValue() {
        return switch (getCurrency()) {
            case BGN -> getBalance() * 0.09;
            case EUR -> getBalance() * 0.07;
            case USD -> getBalance() * 0.05;
            case GBP -> getBalance() * 0.10;
            default -> 0;
        };
    }
}
