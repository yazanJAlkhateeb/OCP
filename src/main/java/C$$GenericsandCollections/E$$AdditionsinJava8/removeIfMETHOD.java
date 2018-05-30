package C$$GenericsandCollections.E$$AdditionsinJava8;

import java.util.ArrayList;
import java.util.List;

public class removeIfMETHOD {
    /*Java 8 introduces a new method called removeIf . Before this, we had the ability to remove
a specified object from a collection or a specified index from a list. Now we can specify
what should be deleted using a block of code.
The method signature looks like this:
boolean removeIf(Predicate<? super E> filter)*/

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list); // [Magician, Assistant]
        list.removeIf(s -> s.startsWith("A"));
        System.out.println(list); // [Magician]
    }
}
