package C$$GenericsandCollections.C$$ComparatorVSComparable.Comparable;

public class Concept {
    /*The Comparable interface has only one method. In fact, this is the entire interface:


public interface Comparable<T> {
public int compareTo(T o);



Remember that id – a.id sorts in ascending order and a.id – id sorts in
descending order.

We said that Comparator is a functional interface because it has a single abstract method.
Comparable is also a functional interface since it also has a single abstract method. How-
ever, using a lambda for Comparable would be silly. The point of Comparable is to imple-
ment it inside the object being compared.
}*/
}
