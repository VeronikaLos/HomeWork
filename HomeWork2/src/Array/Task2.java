package Array;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int n;
        int low;
        int high;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Введен неверный размер массива, попробуйте еще");
            n = sc.nextInt();
        }

        System.out.println("Введите нижний диапазон значений");
        low = sc.nextInt();
        while (low <= 0) {
            System.out.println("Введен неверно нижний диапазон, попробуйте еще");
            low = sc.nextInt();
        }

        System.out.println("Введите верхний диапазон значений");
        high = sc.nextInt();
        while (high <= 0 || high <= low) {
            System.out.println("Введен неверно верхний диапазон, попробуйте еще");
            high = sc.nextInt();
        }

        Random rand = new Random();
        int[] ar;
        ar = new int[n];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = rand.nextInt(high - low) + low;
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print("arr[" + i + "]=" + ar[i] + "; ");
        }
    }
}
