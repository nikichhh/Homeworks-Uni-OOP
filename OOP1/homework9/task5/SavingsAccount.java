package bg.tu_varna.sit.b2.f23621689.homework9.task5;

public class SavingsAccount extends Account {
    public SavingsAccount(String id, AccountType type, Currency currency, double balance) throws InvalidDataException {
        super(id, type, currency, balance);
    }

    @Override
    public double calculateInterestValue() {
        return switch (getCurrency()) {
            case BGN -> getBalance() * 0.12;
            case EUR -> getBalance() * 0.10;
            case USD -> getBalance() * 0.08;
            case GBP -> getBalance() * 0.15;
            default -> 0;
        };
    }
}
