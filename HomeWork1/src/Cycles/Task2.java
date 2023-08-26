package Cycles;

public class Task2 {
    public static void main(String[] args) {
        int x = 1;
        do {
            if (x % 5 == 0) {
                System.out.println(x);
                x++;
            } else x++;
        }
        while (x < 101);
    }
}