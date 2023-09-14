package Lab2b;

/*  Comp3111LEx\Lab2b\Book.java
    Book class for Lab2 Exercise 2 */
public class Book {
    private String chapters[];
    private static final int DEFAULT_CHAPTERS = 10;

    public Book() {
        chapters = new String[DEFAULT_CHAPTERS];
        for (int i = 0; i < chapters.length; i++)
            chapters[i] = "n/a";
    }

    public Book (String argument[]) {
        // Initialize chapter array
        chapters = new String[argument.length];
        // Copy chapter title Strings from argument
        for (int i = 0; i < argument.length; i++)
            chapters[i] = argument[i];
    }
    public String getChapter(int i ) {
        return chapters[i];
    }
    public String[] getChapters() {
        return chapters;
    }
}
