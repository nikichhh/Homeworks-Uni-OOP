package bg.tu_varna.sit.b2.f23621689.homework4.task02;
import java.util.Scanner;

/**
 * Анализирайте задачата и определите грешката (без да пренаписвате целия код),
 *  така че да се отпечатат на нов ред всички думи, започващи с "p", но само максимум n символа от тях.
 *
 * Вход 1 през аргументите от команден ред:
 * "phahah put"
 * 3
 * Резултат 1:
 * phah
 * put
 *
 * Вход 2 през аргументите от команден ред:
 * "No match"
 * 5
 * Резултат 2:
 * no
 *
 * Вход 3 през аргументите от команден ред:
 * "preparation"
 *  4
 * Резултат 3:
 * prepa
 *
 * Вход 4 през аргументите от команден ред:
 * "preposition"
 * 0
 * Резултат 4:
 * p
 */


public class Application {
    public static void main(String[] args) {
        //Добавен scanner
        Scanner scanner = new Scanner(System.in);
        args = new String[] {scanner.nextLine(), scanner.nextLine()};

        String text = args[0];
        int jump = Integer.parseInt(args[1]);

        //Сменено 'p', защото явно е взет друг знак от друг език
        char search = 'p';
        boolean hasMatch = false;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == search) {
                hasMatch = true;
                int endIndex = i + jump;

                String matchedString = "";

                //Променена логика
                if (endIndex >= text.length()) {
                    endIndex = text.length();
                    matchedString = text.substring(i, endIndex);
                }
                else {
                    matchedString = text.substring(i, endIndex + 1);
                }

                System.out.println(matchedString);

                //Добавена логика
                if (jump == 0) {
                    break;
                }
                else {
                    i += jump - 1;
                }
            }
        }
        if (!hasMatch) {
            System.out.println("no");
        }
    }
}
