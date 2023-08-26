package Cycles;

public class Task4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        for (int i = b - 1; i > a; i--) {
            System.out.println(i);
        }
        System.out.println(b - a - 1);
    }
}
