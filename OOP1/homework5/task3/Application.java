package bg.tu_varna.sit.b2.f23621689.homework5.task3;

public class Application {
    public static void main(String[] args) {
        CompanyLtd ltd = new CompanyLtd("Firma OOD", 100000, 80000, 50000, 20000);
        CompanyST st = new CompanyST("Firma ET", 50000, 30000, "Ivan Ivanov", true);

        System.out.println("Фирма: " + ltd.getName() + ", EIK: " + ltd.getEik() + ", Дължим данък: " + ltd.calculateTax());
        System.out.println("Фирма: " + st.getName() + ", EIK: " + st.getEik() + ", Дължим данък: " + st.calculateTax());
    }
}
