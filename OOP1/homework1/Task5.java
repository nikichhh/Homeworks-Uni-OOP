package bg.tu_varna.sit.b2.f23621689.homework1;

public class Task5 {
    public static void main(String[] args) {
        int[] randomNumbers = {15, 32, 5, 15, 37, 42, 84, 42, 94, 12};

        // Пиша им индекс 11, понеже масива има 10 елемента и да няма грешки после
        int firstIndex = 11, secondIndex = 11;

        for (int i = 0; i < 3; i++) {
            int maxNum = randomNumbers[0];
            int biggestIndex = 11;
            for (int j = 1; j < randomNumbers.length; j++) {
                if (maxNum < randomNumbers[j] && randomNumbers[j] % 2 == 0) {
                    if(firstIndex == j) {
                        continue;
                    }
                    else if(secondIndex == j) {
                        continue;
                    }

                    maxNum = randomNumbers[j];
                    biggestIndex = j;
                }

                if(i == 0){
                    firstIndex = biggestIndex;
                }
                else if(i == 1) {
                    secondIndex = biggestIndex;
                }
            }
            System.out.println("Biggest number now is: " + maxNum);
        }
    }
}
