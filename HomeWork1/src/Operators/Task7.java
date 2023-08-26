package Operators;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Введите день месяца - ");
        int day = sc.nextInt();

        System.out.print("Введите номер месяца - ");
        int month = sc2.nextInt();

        switch (month) {
            case 1:
                if (day > 19) {
                    System.out.println("Водолей");
                } else System.out.println("Козерог");
                break;

            case 2:
                if (day > 18) {
                    System.out.println("Рыбы");
                } else System.out.println("Водолей");
                break;

            case 3:
                if (day > 20) {
                    System.out.println("Овен");
                } else System.out.println("Рыбы");
                break;

            case 4:
                if (day > 19) {
                    System.out.println("Телец");
                } else System.out.println("Овен");
                break;

            case 5:
                if (day > 20) {
                    System.out.println("Близнецы");
                } else System.out.println("Телец");
                break;

            case 6:
                if (day > 21) {
                    System.out.println("Рак");
                } else System.out.println("Близнецы");
                break;

            case 7:
                if (day > 22) {
                    System.out.println("Лев");
                } else System.out.println("Рак");
                break;

            case 8:
                if (day > 22) {
                    System.out.println("Дева");
                } else System.out.println("Лев");
                break;

            case 9:
                if (day > 22) {
                    System.out.println("Весы");
                } else System.out.println("Дева");
                break;

            case 10:
                if (day > 22) {
                    System.out.println("Скорпион");
                } else System.out.println("Весы");
                break;

            case 11:
                if (day > 22) {
                    System.out.println("Стрелец");
                } else System.out.println("Скорпион");
                break;

            case 12:
                if (day > 21) {
                    System.out.println("Козерог");
                } else System.out.println("Стрелец");
                break;
        }
    }
}
