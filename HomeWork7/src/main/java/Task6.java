import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) throws IncorrectInfoException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ФИО через пробел");
        String str = sc.nextLine();
        System.out.println("Введите возраст");
        int x = sc.nextInt();

        Pattern pattern = Pattern.compile("(\\W)");
        Matcher matcher = pattern.matcher(str);

        if (x > 100 || x < 0) {
            throw new IncorrectInfoException(str, x, "Введен неверный возраст");
        } else if (str.length() > 200) {
            throw new IncorrectInfoException(str, x, "Неверное ФИО, введено больше 200 символов");
        } else if (matcher.find()) {
            throw new IncorrectInfoException(str, x, "Неверное ФИО, содержит символы");
        } else System.out.println(str + " " + x + " лет");
    }
}
