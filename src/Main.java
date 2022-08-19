import java.util.Arrays;
import java.util.Random;

public class Main {


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        String arrString = Arrays.toString(arr);
        System.out.println(arr);
        return arr;


        //



    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }


        //task 1
        System.out.println("\nЗадание 1");
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.print("Сумма трат за месяц составила " + sum + " рублей");

        //task 2
        System.out.println(" \n\nЗадание 2");
        int minArr = 200_000;
        for (int j : arr) {
            if (j < minArr) {
                minArr = j;
            }
        }
        System.out.print("Минимальные затраты " + minArr + " рублей");
        int maxArr = 100_000;
        for (int j : arr) {
            if (j > maxArr) {
                maxArr = j;
            }
        }
        System.out.print(", а максимальные затраты " + maxArr + " рублей");
        //task 3
        System.out.println("\n\nЗадание 3");

        float sum1 = 0;
        for (int i : arr) {
            sum1 += i;
        }
        float vSum = sum1 / arr.length;
        String str = String.format("Средняя сумма трат за месяц составила  %.2f рублей ", vSum);
        System.out.println(str);
        //task 4
        System.out.println("\n\nЗадание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int i= reverseFullName.length - 1;
        for (; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }






    }


}