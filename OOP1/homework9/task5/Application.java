package bg.tu_varna.sit.b2.f23621689.homework9.task5;

public class Application {
    public static void main(String[] args) {
        try {
            Bank bank = new Bank("Моята банка", 10);

            Account acc1 = new DepositAccount("ACC001", AccountType.PERSONAL, Currency.BGN, 1000);
            Account acc2 = new SalaryAccount("ACC002", AccountType.CORPORATE, Currency.USD, 5000);
            Account acc3 = new SavingsAccount("ACC003", AccountType.PERSONAL, Currency.EUR, 3000);
            Account acc4 = new SalaryAccount("ACC004", AccountType.CORPORATE, Currency.GBP, 2000);

            bank.createAccount(acc1);
            bank.createAccount(acc2);
            bank.createAccount(acc3);
            bank.createAccount(acc4);

            System.out.println(bank);
            System.out.println("Брой заплатни сметки: " + bank.calculateNumberOfSalaryAccounts());
            System.out.println("Средна лихва за EUR: " + bank.calculateAverageInterestByCurrency(Currency.EUR));
            System.out.println("Сметка с най-висока лихва: " + bank.findHighestInterest());

            bank.closeAccount("ACC002");
            System.out.println("След закриване на сметка ACC002:\n" + bank);

        } catch (InvalidDataException e) {
            System.out.println("Грешка: " + e.getMessage());
        }
    }
}
