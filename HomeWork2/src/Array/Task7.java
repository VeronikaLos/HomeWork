package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {
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

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print("arr[" + i + "]=" + array[i] + "; ");
        }
        System.out.println();

        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите искомое чило");
        k = sc.nextInt();

        int index;
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                index = i;
                System.out.println("Индекс элемента с числом " + k + " - " + "[" + index + "]");
                break;
            } else {
                count++;
            }
        }
        if (count <= n) {
            System.out.println("Линейный поиск " + count + " шаг(-а)");
        } else {
            System.out.println("Элемент не найден");
        }

        int first = 0;
        int last = n - 1;
        int count2 = 1;
        int position = (first + last) / 2;

        while ((array[position] != k) && (first <= last)) {
            count2++;
            if (array[position] > k) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println("Двоичный поиск " + count2 + " шаг(-а)");
        }
    }
}
