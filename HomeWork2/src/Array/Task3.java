package Array;

import java.util.Random;
import java.util.Scanner;

public class Task3 {

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

        int max = array[0];
        int count = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                count = i;
            }
        }
        System.out.println("Индекс элемента массива с максимальным значением - " + count);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print("arr[" + i + "]=" + array[i] + "; ");
        }
    }
}



