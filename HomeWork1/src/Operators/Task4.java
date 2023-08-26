package Operators;

public class Task4 {
    public static void main(String[] args) {
        int x = 1300;

        if (x % 4 != 0) {
            System.out.println(365);
        } else if (x % 100 == 0 && x % 400 != 0) {
            System.out.println(365);
        } else if (x % 100 == 0 && x % 400 == 0) {
            System.out.println(366);
        } else if (x % 4 == 0) {
            System.out.println(366);
        }
    }
}
