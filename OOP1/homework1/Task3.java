package bg.tu_varna.sit.b2.f23621689.homework1;

public class Task3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            if (i == 1 || i == 3 || i == 5){
                System.out.println("Кабинетът работи между 13:30 и 18:00");
            }
            else if (i == 2 || i == 4) {
                System.out.println("Кабинетът работи между 8:00 и 12:30");
            }
            else {
                System.out.println("Кабинетът почива днеска");
            }
        }
    }
}
