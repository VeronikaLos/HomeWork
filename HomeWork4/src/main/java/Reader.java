import java.util.Arrays;
import java.util.Objects;

public class Reader {
    private String lastName;
    private int readerNumberTicket;
    private String facultet;
    private String birthdate;
    private long phone;
    private String[] list;

    public Reader(String lastName, int readerNumberTicket, String facultet, String birthdate, long phone, String[] list) {
        this.lastName = lastName;
        this.readerNumberTicket = readerNumberTicket;
        this.facultet = facultet;
        this.birthdate = birthdate;
        this.phone = phone;
        this.list = list;
    }
    public String[] getList() {
        return list;
    }
    public String getLastName() {
        return lastName;
    }
    public void setList(String[] list) {
        this.list = list;
    }
    void printStatus(String lastName, String[] list) {
        System.out.println(lastName + " взял " + list.length + " книг: ");
        System.out.println(Arrays.toString(list));
    }
    public void takeBook(String[] list, Book book, String lastName) {
        String[] list2 = new String[list.length + 1];
        System.arraycopy(list, 0, list2, 0, list.length);
        list2[list.length] = String.valueOf(book);
        list2[list2.length-1] = (book.getName() + " " + book.getAuthorName());
        System.out.println(lastName + " взял книгу " + list2[list.length-1]);
        System.out.println("Всего в списке " + list2.length + " книг.");
        System.out.println(Arrays.toString(list2));
    }

    public void returnBook(String[] list, String name, String lastName) {
        for (int i = 0; i < list.length; i++) {
            if (Objects.equals(list[i], name)) {
                int index = i;
                String[] list2 = new String[list.length - 1];
                System.arraycopy(list, 0, list2, 0, index);
                System.arraycopy(list, index + 1, list2, index, list.length - index - 1);
                System.out.println(lastName + " вернул книгу " + name);
                System.out.println("Всего в списке " + list2.length + " книг.");
                System.out.println(Arrays.toString(list2));
                break;
            } else if (i == list.length - 1) {
                System.out.println(lastName + " не хранит книгу " + name);
            }
        }
    }
}
