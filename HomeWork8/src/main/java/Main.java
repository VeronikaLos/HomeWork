import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action;
        ArrayList<Reader> readers = new ArrayList<>();

        do {
            System.out.println("Выберите действие:");
            System.out.println("1 - Добавить нового читателя");
            System.out.println("2 - Читатель хочет взять книгу");
            System.out.println("3 - Читатель хочеть вернуть книгу");
            System.out.println("4 - Вывести статус читателя");
            System.out.println("5 - Вывести статусы всех читателей");
            System.out.println("6 - Выйти из программы");
            action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 1: {
                    System.out.println("Введите имя и фамилию читателя:");
                    String lastname = scanner.nextLine();
                    System.out.println("Введите номер читательского билета:");
                    int readerNumberTicket = scanner.nextInt();
                    scanner.nextLine();
                    boolean isExist = false;
                    for (Reader reader : readers) {
                        if (reader.getreaderNumberTicket() == readerNumberTicket) {
                            isExist = true;
                            break;
                        }
                    }
                    if (!isExist) {
                        Reader reader = new Reader(lastname, readerNumberTicket);
                        readers.add(reader);
                        System.out.print("Читатель " + lastname + " c номером билета " + readerNumberTicket + " добавлен");
                    } else {
                        System.out.println("Читатель с номером читательского билета " + readerNumberTicket + " уже существует");
                    }
                    break;
                }

                case 2: {
                    System.out.println("Введите имя автора:");
                    String authorName = scanner.nextLine();
                    System.out.println("Введите название книги:");
                    String title = scanner.nextLine();
                    System.out.println("Введите номер читателя:");
                    int readerNumber = scanner.nextInt();
                    scanner.nextLine();

                    Book book = new Book(title, authorName);
                    boolean isExists = false;
                    for (Reader reader : readers) {
                        if (reader.getreaderNumberTicket() == readerNumber) {
                            Reader.takeBook(reader, book);
                            isExists = true;
                            break;
                        }
                    }

                    if (!isExists) {
                        System.out.println("Такого читателя не существует");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Введите название книги:");
                    String title = scanner.nextLine();
                    System.out.println("Введите номер читателя:");
                    int readerNumber = scanner.nextInt();
                    scanner.nextLine();

                    boolean isExists = false;
                    for (Reader reader : readers) {
                        if (reader.getreaderNumberTicket() == readerNumber) {
                            reader.returnBook(title);
                            isExists = true;
                        }
                    }

                    if (!isExists) {
                        System.out.println("Такого читателя не существует");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Введите номер читателя:");
                    int readerNumber = scanner.nextInt();
                    scanner.nextLine();

                    boolean isExists = false;
                    for (Reader reader : readers) {
                        if (reader.getreaderNumberTicket() == readerNumber) {
                            reader.printStatus();
                            isExists = true;
                            break;
                        }
                    }

                    if (!isExists) {
                        System.out.println("Такого читателя не существует");
                    }
                    break;
                }
                case 5: {
                    boolean isExists = false;
                    for (Reader reader : readers) {
                        Reader.printStatus(reader);
                        isExists = true;
                    }
                    if (!isExists) {
                        System.out.println("Отсутствуют читатели");
                    }
                    break;
                }
                case 6: {
                    System.out.println("Завершение работы");
                    break;
                }
                default: {
                    System.out.println("Нет такой команды");
                }
            }
        } while (action != 6);
    }
}
