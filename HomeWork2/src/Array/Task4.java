package Array;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
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

        System.out.print("Исходный массив:\t\t");

        for (int i = 0; i < array.length; i++) {
            System.out.print("arr[" + i + "]=" + array[i] + "; ");
        }
        System.out.println();

        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.print("Отсортированный массив:\t\t ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("arr[" + i + "]=" + array[i] + "; ");
        }
    }
}
