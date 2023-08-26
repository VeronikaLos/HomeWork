package Pack1;

public class Main {
    public static void main(String[] args) {

        Phone iphone = new Phone(222333555, 100, "Pro");
        Phone samsung = new Phone(125125125, 120, "Lite");
        Phone huawei = new Phone(580580580, 130, "Gold");

        System.out.println("iphone");
        System.out.print("number - " + iphone.getNumber());
        System.out.print(" /model - " + iphone.getModel());
        System.out.println(" /weight - " + iphone.getWeigh());

        System.out.println("samsung");
        System.out.print("number - " + samsung.getNumber());
        System.out.print(" /model - " + samsung.getModel());
        System.out.println(" /weight - " + samsung.getWeigh());

        System.out.println("huawei");
        System.out.print("number - " + huawei.getNumber());
        System.out.print(" /model - " + huawei.getModel());
        System.out.println(" /weight - " + huawei.getWeigh());

        iphone.receiveCall("Mama");
        System.out.println(" " + iphone.getNumber());

        samsung.receiveCall("Папа");
        System.out.println(" " + samsung.getNumber());

        huawei.receiveCall("Муж");
        System.out.println(" " + huawei.getNumber());

        iphone.receiveCall(iphone.getNumber(), "Бабушка");
        System.out.println();
        System.out.print("Номера телефонов для отправки сообщений - ");
        sendMessage(iphone.getNumber(), samsung.getNumber(), huawei.getNumber());
    }
    static void sendMessage(int... numbers) {
        for (int a : numbers) {
            System.out.print(a + ", ");
        }
    }
}
