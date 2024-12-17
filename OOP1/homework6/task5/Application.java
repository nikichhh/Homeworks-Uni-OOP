package bg.tu_varna.sit.b2.f23621689.homework6.task5;

public class Application {
    public static void main(String[] args) {
        Drink cola = new SoftDrink("Cola", 8, 0.5, true);
        Drink whiskey = new AlcoholicBeverage("Whiskey", 4, 0.2, 40);

        System.out.println(cola);
        cola.serve(3);
        System.out.println(cola);
        cola.deliver(10);
        System.out.println(cola);

        System.out.println();

        System.out.println(whiskey);
        whiskey.serve(3);
        System.out.println(whiskey);
        whiskey.deliver(6);
        System.out.println(whiskey);
    }
}
