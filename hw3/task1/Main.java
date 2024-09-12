package hw3.task1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Printable> printables = Arrays.asList(
                new Book("book1"),
                new Book("book2"),
                new Magazine("magazine2"),
                new Book("book3"),
                new Magazine("magazine3"),
                new Book("book4"),
                new Book("book5"),
                new Magazine("magazine1"),
                new Magazine("magazine4")
        );
        for (Printable printable : printables) {
            printable.print();
        }
    }
}
