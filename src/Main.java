import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        // Задание 1
        int amount = 0;
        for (int i = 0; i < arr.length; i++){
            amount += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + amount + " рублей.");

        // Задание 2
        int min = 200_001;
        int max = 99_999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
        }
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

        // Задание 3
        double average = (double) amount / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        // Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i>=0; i--){
            System.out.print(reverseFullName[i]);
        }


    }


    public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }


}