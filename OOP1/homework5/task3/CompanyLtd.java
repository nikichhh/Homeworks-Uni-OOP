package bg.tu_varna.sit.b2.f23621689.homework5.task3;

public class CompanyLtd extends Company {
    private double capital;
    private double profit;

    CompanyLtd(String name, double incomes, double costs, double capital, double profit) {
        super(name, incomes, costs);
        this.capital = capital;
        this.profit = profit;
    }

    double getCapital() {
        return capital;
    }

    double getProfit() {
        return profit;
    }

    double calculateTax() {
        double operationalProfit = getIncomes() - getCosts();
        if (operationalProfit <= 0) {
            return 0;
        }

        if (profit < 0) {
            operationalProfit += profit;
            if (operationalProfit <= 0) {
                return 0;
            }
        }

        return operationalProfit * 0.10;
    }
}
