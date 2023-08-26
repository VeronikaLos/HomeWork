package Cycles;

public class Task8 {
    public static void main(String[] args) {
        int sum = 1000;
        int interest = 15;
        double interestAmount = 0;
        double sum2 = sum;
        int count = 0;

        while (sum2 <= 1100) {
            interestAmount = sum2 * interest / 100 / 12;
            sum2 +=interestAmount;
            count++;
        }
        System.out.println("Количество месяцев через которое сумма депозита будет больше 1100 = " + count);
        System.out.println("Итоговый размер вклада = " + sum2);
    }
}
