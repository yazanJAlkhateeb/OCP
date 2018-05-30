package C$$GenericsandCollections.E$$AdditionsinJava8;

import C$$GenericsandCollections.Duck;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.function.Supplier;
/*There are four formats for method references:
■ Static methods
■ Instance methods on a particular instance
■ Instance methods on an instance to be determined at runtime
■ Constructors*/

public class UsingMethodReferences   {
    /*Method references are a way to make the code shorter by reducing some of the code that
can be inferred and simply mentioning the name of the method*/

    static class DuckHelper {
        public static int compareByWeight(Duck d1, Duck d2) {
            return d1.getWeight()-d2.getWeight();
        }
        public static int compareByName(Duck d1, Duck d2) {
            return d1.getName().compareTo(d2.getName());
        }

        /*and you can make it like: */
        Comparator<Duck> lam=(s1,s2)->DuckHelper.compareByName(s1,s2);
        /*and you can smash it by MethodREf*/
        Comparator<Duck> mRef= DuckHelper::compareByName;

        /*DuckHelper::compareByWeight returns a functional interface and not an
int . Remember that :: is like lambdas, and it is typically used for deferred
execution.*/

        /*Other Examples*/
        Predicate<String> methodRef3 = String::isEmpty;
        Predicate<String> lambda3 = s -> s.isEmpty();


        public static void main(String[] args) {
            Supplier<ArrayList<Integer>> methodRef4 = ArrayList::new;
            Supplier<ArrayList> lambda4 = () -> new ArrayList();
            methodRef4.get();
        }
    }
}
