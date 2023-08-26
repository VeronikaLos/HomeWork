package Array;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int n;
        int low;
        int high;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        n = scan.nextInt();

        System.out.println("Введите нижний диапазон значений");
        low = scan.nextInt();

        System.out.println("Введите верхний диапазон значений");
        high = scan.nextInt();

        Random rand = new Random();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(high - low) + low;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print("arr[" + i + "]=" + array[i] + "; ");
        }
        System.out.println();

        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print("arr[" + i + "]=" + array[i] + "; ");
        }
        System.out.println();

    }
}
