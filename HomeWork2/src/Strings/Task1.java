package Strings;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String string1 = new String();
        char char1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        string1=scan.nextLine();

        System.out.println("Введите символ");
        char1=scan.next ().charAt (0);

        int counter = 0;
        for (int i = 0; i < string1.length(); i++)
        {
            if (string1.charAt(i) == char1) {
                counter++;
            }
        }
        System.out.println("Kоличество вхождений символа " + char1 + " в строку " + string1 + " - " + counter);
    }
}
