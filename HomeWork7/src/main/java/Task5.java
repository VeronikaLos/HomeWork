import java.text.ParseException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату в формате yyyy-MM-dd");
        String strdate = sc.nextLine();

        Pattern pattern = Pattern.compile("(1\\d{3}|20[0-1][0-2])-([0][1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|30)");
        Matcher matcher = pattern.matcher(strdate);

        if (matcher.find()) {
            System.out.println(matcher.group() + " - существует");
        }
        else System.out.println(strdate + " не существует ");
    }
}
