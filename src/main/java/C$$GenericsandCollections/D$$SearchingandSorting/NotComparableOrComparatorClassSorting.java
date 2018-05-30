package C$$GenericsandCollections.D$$SearchingandSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NotComparableOrComparatorClassSorting {

    static class SortRabbits {
        public static void main(String[] args) {
            List<Rabbit> rabbits = new ArrayList<>();
            rabbits.add(new Rabbit());
//DOES NOT COMPILE//Collections.sort(rabbits);//DOES NOT COMPILE//
            /*Java knows that the Rabbit class is not Comparable . It knows sorting will fail, so it
            doesn’t even let the code compile. You can fix this by passing a Comparator to sort() .
                    Remember that a Comparator is useful when you want to specify sort order without using a
            compareTo() method:*/
        }

        static class Rabbit {
            int id;
        }
        static class SortRabbitsComparator {

            public static void main(String[] args) {
                List<Rabbit> rabbits = new ArrayList<>();
                rabbits.add(new Rabbit());
                Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
                Collections.sort(rabbits, c);
            }
        }
    }
}
