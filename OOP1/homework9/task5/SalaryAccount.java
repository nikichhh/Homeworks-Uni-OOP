package bg.tu_varna.sit.b2.f23621689.homework9.task5;

public class SalaryAccount extends Account {
    public SalaryAccount(String id, AccountType type, Currency currency, double balance) throws InvalidDataException {
        super(id, type, currency, balance);
    }

    @Override
    public double calculateInterestValue() {
        return switch (getCurrency()) {
            case BGN -> getBalance() * 0.05;
            case EUR -> getBalance() * 0.03;
            case USD -> getBalance() * 0.02;
            case GBP -> getBalance() * 0.06;
            default -> 0;
        };
    }
}
