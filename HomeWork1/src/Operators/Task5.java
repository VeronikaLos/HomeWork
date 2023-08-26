package Operators;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 5;
        int b = 7;
        int result;
        int n = 1;
        while (n >= 1 && n <= 4) {
            System.out.print("Введите номер действия от 1 до 4 - ");
            n = scanner.nextInt();
            if (n >= 1 && n <= 4) {
                switch (n) {
                    case 1:
                        result = a + b;
                        System.out.println(a + "+" + b + '=' + result);
                        break;
                    case 2:
                        result = a - b;
                        System.out.println(a + "-" + b + '=' + result);
                        break;
                    case 3:
                        result = a * b;
                        System.out.println(a + "*" + b + '=' + result);
                        break;
                    case 4:
                        result = a / b;
                        System.out.println(a + "/" + b + '=' + result);
                        break;
                }
            } else System.out.println("Incorrect action");
        }
    }
}
