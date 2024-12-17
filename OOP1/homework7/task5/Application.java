package bg.tu_varna.sit.b2.f23621689.homework7.task5;

public class Application {
    public static void main(String[] args) {
        SoftDrink cola = new SoftDrink("Cola", 8.0, 0.5, false, "Cola Flavor");
        AlcoholicBeverage whiskey = new AlcoholicBeverage("Whiskey", 4.0, 0.05, 40);

        System.out.println(cola);
        System.out.println(whiskey);

        cola.deliver(5.0);
        whiskey.deliver(3.0);
        System.out.println("\nAfter delivery:");
        System.out.println(cola);
        System.out.println(whiskey);

        System.out.println("\nServing drinks:");
        cola.serve(10);
        whiskey.serve(30);
        System.out.println(cola);
        System.out.println(whiskey);

        System.out.println("\nIs whiskey proper for 20-year-old? " + whiskey.isProper(20));
        System.out.println("Is whiskey proper for 25-year-old? " + whiskey.isProper(25));
    }
}
