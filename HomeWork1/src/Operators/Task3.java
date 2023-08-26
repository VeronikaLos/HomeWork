package Operators;

public class Task3 {
    public static void main(String[] args) {
        int a =5;
        int b = 15;
        int c = 21;
        int sum;

        if (a <= b && a <= c) {
            sum = b + c;
            System.out.println(sum);
        } else if (b <= a && b <= c) {
            sum = a + c;
            System.out.println(sum);
        } else if (c <= a && c <= b) {
            sum = a + b;
            System.out.println(sum);
        }
    }
}
