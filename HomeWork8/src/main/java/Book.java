public class Book {
    private String name;
    private String authorName;
    private String text;

    Book (String name,String authorName) {
        this.name=name;
        this.authorName=authorName;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + ", " + authorName;
    }
}
