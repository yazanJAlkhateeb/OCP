package C$$GenericsandCollections.A$$WorkingwithGenerics.S$$Bounds.UnboundedWildCard;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildCardWrong {
    /*An unbounded wildcard represents any data type. You use ? when you want to specify that
any type is OK with you*/
    public static void printList(List<Object> list) {
        for (Object x: list) System.out.println(x);
    }
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        //printList(keywords);// DOES NOT COMPILE
    /*Java is trying to protect us from ourselves with this one.*/

        List<Integer> numbers = new ArrayList<>();
        numbers.add(new Integer(42));
        //List<Object> objects = numbers;// DOES NOT COMPILE
       // objects.add("forty two");
        System.out.println(numbers.get(1));
    /*Good thing that the compiler prevents this*/

    /*We can’t write List<Object> l = new ArrayList<String>(); because Java is trying to
protect us from a runtime exception*/
    }
}
