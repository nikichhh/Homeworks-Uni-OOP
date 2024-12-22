package bg.tu_varna.sit.b2.f23621689.homework10.task2;

public class Bank {
    private Account[] bankAccounts;
    private int accountCount;

    public Bank(int capacity) {
        this.bankAccounts = new Account[capacity];
        this.accountCount = 0;
    }

    public void addAccount(Account account) {
        if (accountCount >= bankAccounts.length) {
            System.out.println("Bank is at full capacity. Cannot add more accounts.");
            return;
        }
        for (int i = 0; i < accountCount; i++) {
            if (bankAccounts[i].getId().equals(account.getId())) {
                System.out.println("Account with this ID already exists.");
                return;
            }
        }
        bankAccounts[accountCount++] = account;
    }

    public void sortAccountsByBalance() {
        for (int i = 0; i < accountCount - 1; i++) {
            for (int j = 0; j < accountCount - i - 1; j++) {
                if (bankAccounts[j].getBalance() > bankAccounts[j + 1].getBalance()) {
                    Account temp = bankAccounts[j];
                    bankAccounts[j] = bankAccounts[j + 1];
                    bankAccounts[j + 1] = temp;
                }
            }
        }
    }

    public void sortAccountsByInterest() {
        for (int i = 0; i < accountCount - 1; i++) {
            for (int j = 0; j < accountCount - i - 1; j++) {
                if (bankAccounts[j].calculateInterestValue() > bankAccounts[j + 1].calculateInterestValue()) {
                    Account temp = bankAccounts[j];
                    bankAccounts[j] = bankAccounts[j + 1];
                    bankAccounts[j + 1] = temp;
                }
            }
        }
    }

    public Currency findCurrencyWithMostAccounts() {
        int[] currencyCount = new int[Currency.values().length];
        for (int i = 0; i < accountCount; i++) {
            currencyCount[bankAccounts[i].getCurrency().ordinal()]++;
        }
        int maxIndex = 0;
        for (int i = 1; i < currencyCount.length; i++) {
            if (currencyCount[i] > currencyCount[maxIndex]) {
                maxIndex = i;
            }
        }
        return Currency.values()[maxIndex];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < accountCount; i++) {
            sb.append(bankAccounts[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
