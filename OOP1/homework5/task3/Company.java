package bg.tu_varna.sit.b2.f23621689.homework5.task3;

import java.util.Random;

abstract class Company {
    private String name;
    private String eik;
    private double incomes;
    private double costs;

    Company(String name, double incomes, double costs) {
        this.name = name;
        this.incomes = incomes;
        this.costs = costs;
        this.eik = generateEik();
    }

    String getName() {
        return name;
    }

    String getEik() {
        return eik;
    }

    double getIncomes() {
        return incomes;
    }

    double getCosts() {
        return costs;
    }

    private String generateEik() {
        Random random = new Random();
        int firstDigit = random.nextInt(9) + 1;
        int remainingDigits = random.nextInt(100000000);
        return String.format("%d%08d", firstDigit, remainingDigits);
    }

    abstract double calculateTax();
}

