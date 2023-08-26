package Array;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] ar = new int[4];
        Random rand = new Random();
        int low = 10;
        int high = 99;

        for (int i = 0; i < ar.length; i++) {
            ar[i] = rand.nextInt(high - low) + low;
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print("arr[" + i + "]=" + ar[i] + "; ");
        }
        System.out.println();

        int min = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > min) {
                min = ar[i];
            }
            else break;
        }
        if (min == ar[3]) {
            System.out.println("Массив по возрастанию");
        } else System.out.println("Массив не по возрастанию");
    }
}
