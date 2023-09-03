public class IncorrectInfoException extends Exception {
    private String name;
    private int age;

    public IncorrectInfoException(String name, int age, String description) {
        super(description);
        this.age = age;
        this.name = name;
    }
}
