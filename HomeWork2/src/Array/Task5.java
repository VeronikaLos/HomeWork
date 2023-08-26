package Array;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] ar = new int[20];
        Random rand = new Random();
        int low = 10;
        int high = 30;

        for (int i = 0; i < ar.length; i++) {
            ar[i] = rand.nextInt(high - low) + low;
        }

        int n;
        int index;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите чило");
        n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Введен неверный размер массива, попробуйте еще");
            n = sc.nextInt();
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print("arr[" + i + "]=" + ar[i] + "; ");
        }
        System.out.println();

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == n) {
                index = i;
                count++;
                System.out.println("Индекс элемента с числом " + n + " - " + index);
            }
        }
        if (count == 0) {
            System.out.println("Элемент не найден");
        }
    }
}
