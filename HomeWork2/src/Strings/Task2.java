package Strings;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String oldString = new String();
        char char1;
        char char2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        oldString=scan.nextLine();

        while (oldString.trim().isEmpty()) {
            System.out.println("Введена пустая строка, повторите ввод");
            oldString=scan.nextLine();
        }

        System.out.println("Введите первый символ");
        char1=scan.next ().charAt (0);

        System.out.println("Введите второй символ");
        char2=scan.next ().charAt (0);

        String newString =  oldString.replace(char1, char2);
        System.out.println(newString);
    }
}
