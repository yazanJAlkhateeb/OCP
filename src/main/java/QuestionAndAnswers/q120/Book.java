package QuestionAndAnswers.q120;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Given the code fragments:
public class Book implements Comparator<Book> {
    String name;
    double price;

    public Book() {
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int compare(Book b1, Book b2) {
        return b1.name.compareTo(b2.name);
    }

    public String toString() {
        return name + ":" + price;
    }

    //and
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book("Beginning with Java", 2), new Book("A Guide to Java Tour", 3));
        Collections.sort(books, new Book());
        System.out.print(books);
    }
}
/*What is the result?
A. [A Guide to Java Tour:3, Beginning with Java:2]///answer
B. [Beginning with Java:2, A Guide to Java Tour:3]
C. A compilation error occurs because the Book class does not override the abstract method
compareTo().
D. An Exception is thrown at run time.*/