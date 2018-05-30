package C$$GenericsandCollections.C$$ComparatorVSComparable.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSample implements Comparable<ComparableSample> {
    private String name;

    public ComparableSample(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List<ComparableSample> comparableSamples = new ArrayList<>();
        comparableSamples.add(new ComparableSample("Quack"));
        comparableSamples.add(new ComparableSample("Puddles"));
        Collections.sort(comparableSamples);
// sort by name
        System.out.println(comparableSamples);
// [Puddles, Quack]
    }

    public String toString() {
// use readable output
        return name;
    }

    public int compareTo(ComparableSample d) {
        return name.compareTo(d.name);
// call String's compareTo
    }
}