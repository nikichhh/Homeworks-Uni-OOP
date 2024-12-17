package bg.tu_varna.sit.b2.f23621689.homework5.task3;

public class CompanyST extends Company {
    private String owner;
    private boolean isPatentActivity;

    CompanyST(String name, double incomes, double costs, String owner, boolean isPatentActivity) {
        super(name, incomes, costs);
        this.owner = owner;
        this.isPatentActivity = isPatentActivity;
    }

    String getOwner() {
        return owner;
    }

    boolean isPatentActivity() {
        return isPatentActivity;
    }

    double calculateTax() {
        if (isPatentActivity) {
            return 500;
        }

        double operationalProfit = getIncomes() - getCosts();
        if (operationalProfit > 0) {
            return operationalProfit * 0.15;
        }

        return 0;
    }
}

