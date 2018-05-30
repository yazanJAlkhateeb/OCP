package C$$GenericsandCollections.D$$SearchingandSorting;

import java.util.Set;
import java.util.TreeSet;

public class UseTreeSetTest {
//    class UseTreeSet {
//       class Rabbit{ int id; }
//        public static void main(String[] args) {
//            Set<Duck> ducks = new TreeSet<>();
//            ducks.add(new Duck("Puddles"));
//            Set<Rabbit> rabbit = new TreeSet<>();
//            rabbit.add(new Rabbit());
//// throws an exception
//        } }

/*Line 6 is fine. Duck does implement Comparable . TreeSet is able to sort it into the proper
        position in the set. Line 8 is a problem. When TreeSet tries to sort it, Java discovers the
        fact that Rabbit does not implement Comparable . Java throws an exception that looks like
        this:
        Exception in thread "main" java.lang.ClassCastException: comparing.Rabbit cannot
        be cast to java.lang.Comparable*/
}
