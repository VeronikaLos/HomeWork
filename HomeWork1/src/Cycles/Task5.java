package Cycles;

public class Task5 {
    public static void main(String[] args) {
        int a = 50;
        int b = 6;

        while (a>b) {
            a=a-b;
        }
        System.out.println("Длина незанятой части отрезка = " + a);
    }
}
