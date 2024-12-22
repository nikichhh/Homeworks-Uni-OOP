package bg.tu_varna.sit.b2.f23621689.homework10.task2;

public class Application {
    public static void main(String[] args) {
        try {
            Bank bank = new Bank(10);

            bank.addAccount(new DepositAccount("D001", AccountType.PERSONAL, Currency.BGN, 1000.0));
            bank.addAccount(new SalaryAccount("S001", AccountType.CORPORATE, Currency.USD, 2000.0));
            bank.addAccount(new SavingsAccount("SA001", AccountType.PERSONAL, Currency.EUR, 1500.0));

            System.out.println("Bank accounts:");
            System.out.println(bank);

            System.out.println("Sorting accounts by balance...");
            bank.sortAccountsByBalance();
            System.out.println(bank);

            System.out.println("Sorting accounts by interest...");
            bank.sortAccountsByInterest();
            System.out.println(bank);

            System.out.println("Currency with most accounts: " + bank.findCurrencyWithMostAccounts());

        } catch (InvalidDataException e) {
            System.err.println(e.getMessage());
        }
    }
}
