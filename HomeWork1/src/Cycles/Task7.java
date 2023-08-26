package Cycles;

public class Task7 {
    public static void main(String[] args) {
        int n = 53526;
        int i;
        boolean result = false;

        while (n > 0) {
            i = n % 10;
            n = n / 10;
            if (i == 2) {
                result = true;
                break;
            }
        }
        System.out.println("Имеется ли в числе цифра «2» - " + result);

        int n2 = 53526;
        int i2;
        int count=0;
        int sum=0;
        while (n2 > 0) {
            i2 = n2 % 10;
            sum += i2;
            System.out.print(i2);
            n2 = n2 / 10;
            count++;
        }
        System.out.println("; количество цифр числа N = " + count);
        System.out.println("сумма цифр числа N = " + sum);
    }
}
