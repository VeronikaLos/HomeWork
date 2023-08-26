package Operators;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        while (true) {
            System.out.print("Введите номер числа от 0 до 999 -  ");
            a = scanner.nextInt();

            if (a>999 | a <0 ) {
                System.out.println("Incorrect");
                break;
            }
            else if (a % 2 == 0) {
                if (a < 10) {
                    System.out.println(a + " - четное однозначное число");
                } else if (a >= 10 && a < 100) {
                    System.out.println(a + " - четное двузначное число");
                } else if (a >= 100 && a <= 999) {
                    System.out.println(a + " - четное трехзначное число");
                }
            } else if (a % 2 != 0) {
                if (a < 10) {
                    System.out.println(a + " - нечетное однозначное число");
                } else if (a >= 10 && a < 100) {
                    System.out.println(a + " - нечетное двузначное число");
                } else if (a >= 100 && a <= 999) {
                    System.out.println(a + " - нечетное трехзначное число");
                }
            }
        }
    }
}