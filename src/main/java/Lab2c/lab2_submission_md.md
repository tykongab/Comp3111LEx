# Student ID: 20855956<br>Name: Kong Tsz Yui

## Code of Part 1: Book.java
```java
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
```
## Code of Part 2: MobileComputer.java
```java
package Lab2c;

/*  Comp3111LEx\Lab2c\MobileComputer.java
    Inherits from Computer, class library for Lab2 Exercise 3   */

public class MobileComputer extends Computer implements Chargeable {
    private int battery;
    public MobileComputer() {
    secret = "MobileComputer secret";
    battery = 5;
    }
    @Override
    public void work() {
        if (battery > 0) {
            System.out.println("It is working on my lap.");
            battery--;
        } else
            System.out.println("Running out of battery");
    }
    @Override
    public void charge() {
        if (battery < 10)
            battery++;
    }
}
```
## Explanation statement of part 2:

I edited MobileComputer class to implement Chargeable interface so that m can be passed into c.charge() in line 25 as charge() requires a Chargeable object. I also annotated MobileComputer.charge() to ensure it is an implementation of charge() in Chargeable interface.