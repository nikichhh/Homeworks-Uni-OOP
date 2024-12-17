package bg.tu_varna.sit.b2.f23621689.homework1;

public class Task1 {
    public static boolean isTriangle(int a, int b, int c) {
        if (a < b + c && b < a + c && c < a + b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));

        if (max == a) {
            return Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2);
        } else if (max == b) {
            return Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2);
        } else {
            return Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2);
        }
    }

    public static void main(String[] args){
        int a = 3, b = 4, c = 17;

        if (isTriangle(a, b, c)) {
            System.out.println("Съществува такъв триъгълник");

            if (isRightTriangle(a, b, c)) {
                System.out.println("Триъгълникът е правоъгълен");
            } else {
                System.out.println("Триъгълникът не е правоъгълен");
            }
        } else {
            System.out.println("Не съществува такъв триъгълник");
        }
    }
}
