package Operators;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Введите достоинство карты от 6 до 14 - ");
        int cardNominal = sc.nextInt();

        System.out.print("Введите масть карты от 1 до 4 - ");
        int cardSuit = sc2.nextInt();

        switch (cardNominal) {
            case 6:
                System.out.println("шестерка");
                break;
            case 7:
                System.out.println("семерка");
                break;
            case 8:
                System.out.println("восьмерка");
                break;
            case 9:
                System.out.println("девятка");
                break;
            case 10:
                System.out.println("десятка");
                break;
            case 11:
                System.out.println("валет");
                break;
            case 12:
                System.out.println("дама");
                break;
            case 13:
                System.out.println("король");
                break;
            case 14:
                System.out.println("туз");
                break;
        }

        switch (cardSuit) {
            case 1:
                System.out.println("пики");
                break;
            case 2:
                System.out.println("трефы");
                break;
            case 3:
                System.out.println("бубны");
                break;
            case 4:
                System.out.println("червы");
                break;
        }
    }
}
