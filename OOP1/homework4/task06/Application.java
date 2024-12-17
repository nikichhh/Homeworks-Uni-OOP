package bg.tu_varna.sit.b2.f23621689.homework4.task06;

/**
 * Анализирайте задачата и определите грешката (без да пренаписвате целия код),
 *  така че да променят стойностите на първоначални масив според операциите:
 *
 *  <операция> <index> <value>
 *
 *      където <операция> е действието което трябва да се изпълни
 *      <index> върху кой елемент на масива трябва да се изпълни действието и <value> втория операнд в операцията
 *
 *      Очакван резултат:
 *      2 0 11  999 11
 */

public class Application {
    public static void main(String[] args) {

        long[] array = {3, 0, 9, 333, 11};

        String[] commands = {
                "add 2 2",
                "subtract 0 1",
                "multiply 3 3",
                "stop",
        };

        for (String command: commands) {
            if (command.equals("stop")) {
                break;
            }

            String[] stringParams = command.split(" ");
            String action = stringParams[0];

            int[] params = new int[2];

            params[0] = Integer.parseInt(stringParams[1]);
            params[1] = Integer.parseInt(stringParams[2]);

            Calculator.performAction(array, action, params);
        }

        ArrayWrapper.printArray(array);
    }
}
