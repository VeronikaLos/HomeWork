import java.util.ArrayList;

public class Reader {
    private ArrayList<Book> books = new ArrayList<>();
    private String lastName;
    private int readerNumberTicket;
    private String facultet;
    private String birthdate;
    private long phone;

    public Reader(String lastName, int readerNumberTicket) {
        this.lastName = lastName;
        this.readerNumberTicket = readerNumberTicket;
    }

    public static void printStatus (Reader reader) {
        System.out.print(reader.lastName + " взял " + reader.books.size() + " книг: ");
        for (Book book : reader.books) {
            System.out.print(book.getName() + ", ");
        }
        System.out.println();
    }

    public void printStatus() {
        printStatus(this);
    }

    public static void takeBook(Reader reader, Book book) {
        if (reader.books.size() == 10) {
            System.out.println("Читатель не может взять больше книг");
        } else {
            reader.books.add(book);
            System.out.println(reader.lastName + " взял(а) книгу " + book.getName());
        }
    }

    public static void returnBook(Reader reader, String name) {
        boolean isExists = false;
        for (int i = 0; i < reader.books.size(); i++) {
                if (reader.books.get(i).getName().equals(name)) {
                    reader.books.remove(i);
                    isExists = true;
                    System.out.println(reader.lastName + " вернул(а) книгу " + name);
                }
            }
            if (!isExists) {
                System.out.println(reader.lastName + " не хранит книгу " + name);
            }
        }

    public void returnBook(String name) {
        returnBook(this, name);
    }

    public int getreaderNumberTicket() {
        return readerNumberTicket;
    }
}
