package C$$GenericsandCollections.D$$SearchingandSorting;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithComparator {
    public static void main(String[] args) {


    Set<NotComparableOrComparatorClassSorting.SortRabbits.Rabbit> rabbit = new TreeSet<>((r1, r2) -> r1.id = r2.id);
rabbit.add(new NotComparableOrComparatorClassSorting.SortRabbits.Rabbit());
}}
