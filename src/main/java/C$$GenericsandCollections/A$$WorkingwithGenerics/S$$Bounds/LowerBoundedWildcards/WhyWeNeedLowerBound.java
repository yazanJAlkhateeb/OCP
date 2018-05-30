package C$$GenericsandCollections.A$$WorkingwithGenerics.S$$Bounds.LowerBoundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class WhyWeNeedLowerBound {
    /*we have a problem
     */
    public static void main(String[] args) {


        List<String> strings = new ArrayList<String>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<Object>(strings);
        addSound(strings);
        addSound(objects);
    }
    /*we want to pass a List<String> and a List<Object> to the same
method*/

    /*see table 3.3 in page 121*/

    /*To solve this problem, we need to use a lower bound:*/
    public static void addSound(List<? super String> list) {
        list.add("quack");
    }
}
