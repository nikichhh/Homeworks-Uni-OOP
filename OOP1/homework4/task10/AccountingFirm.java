package bg.tu_varna.sit.b2.f23621689.homework4.task10;


public class AccountingFirm {
    public static double calculateInterest(Deposit[] deposits, String currency) {
        double interest = 0.0;
        for (Deposit deposit : deposits) {
            if (deposit.getCurrency().equals(currency)) {
                interest += deposit.calculateInterestPerDeposit();
            }
        }
        return interest;
    }
}
