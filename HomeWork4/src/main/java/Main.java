public class Main {
    public static void main(String[] args) {

        Reader reader1 = new Reader(
                "Ivanov A A", 1550, "Economica", "05.15.2001", 555666777,
                new String[]{"Book1", "Book2", "Book3", "Book4", "Book5", "Book6", "Book7", "Book8", "Book9", "Book10" });
        Book book11 = new Book("Book11", "Mamontov");

        reader1.printStatus("Ivanov A A", reader1.getList());
        System.out.println();
        reader1.takeBook(reader1.getList(), book11, reader1.getLastName());
        System.out.println();
        reader1.returnBook(reader1.getList(), "Book10", reader1.getLastName());
    }
}