package C$$GenericsandCollections.C$$ComparatorVSComparable.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSample {
    /*Suppose that we add weight to our Duck class. We now have the following:*/
    static class Duck implements Comparable<Duck> {
        private String name;
        private int weight;
        public Duck(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }
        public String getName() { return name; }
        public int getWeight() { return weight; }
        public String toString() { return name; }
        public int compareTo(Duck d) {
            return name.compareTo(d.name);
        }
    }
    /*
    The Duck class itself can define compareTo() in only one way. In this case, name was
    chosen. If we want to sort by something else, we have to define that sort order outside the
    compareTo() method:*/
    public static void main(String[] args) {
        Comparator<Duck> byWeightt = new Comparator<Duck>() {
            @Override
            public int compare(Duck o1, Duck o2) {
                return o1.getWeight()-o2.getWeight();
            }
        };
        Comparator<Duck> byWeight = (d1, d2) -> d1.getWeight()-d2.getWeight();
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
        Collections.sort(ducks);
        System.out.println(ducks);
// [Puddles, Quack]
        ducks.sort(byWeight);
        System.out.println(ducks);
// [Quack, Puddles]
    }
}

