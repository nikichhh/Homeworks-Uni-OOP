package bg.tu_varna.sit.b2.f23621689.homework2.task3;

public class Application {
    public static void main(String[] args) {
        Account account1 = new Account(123456, "BGN", 1000.00);
        Account account2 = new Account(987654, "USD", 1500.50);
        Account account3 = new Account(555555, "BGN", 2000.00);

        Account[] accounts = {account1, account2, account3};
        Bank bank = new Bank(accounts);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);

        String currencyToCheck = "BGN";
        double averageBalance = bank.calculateAverageBalanceByCurrency(currencyToCheck);
        System.out.println("Average balance in " + currencyToCheck + ": " + averageBalance);

    }
}
