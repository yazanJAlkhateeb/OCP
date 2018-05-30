package C$$GenericsandCollections.D$$SearchingandSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class binarySearchWithComparator {
    /*sort() and binarySearch() allow you to pass in a Comparator object when you don’t want
to use the natural order*/
    public static void main(String[] args) {


        List<String> names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> c = Comparator.reverseOrder();
        int index = Collections.binarySearch(names, "Hoppy", c);
        System.out.println(index);
    }
    /*The correct answer is -1 . Before you panic, you don’t need to know that the answer
is -1 . You do need to know that the answer is not defined.*/
}
