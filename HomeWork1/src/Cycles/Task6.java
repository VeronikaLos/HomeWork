package Cycles;

public class Task6 {
    public static void main(String[] args) {
        int a = 7;
        int b = 10;
        int c = 2;
        int count1 = 0;
        int count2 = 0;
        int quan = 0;

        while (a >= c) {
            a = a - c;
            count1++;
        }

        while (b >= c) {
            b = b - c;
            count2++;
        }
        quan = count1 * count2;

        System.out.println("количество квадратов = " + quan);
    }
}
