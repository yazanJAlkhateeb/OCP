package C$$GenericsandCollections.C$$ComparatorVSComparable.Comparable;

public class LegacyDuck implements Comparable {
    private String name;

    public int compareTo(Object obj) {
        LegacyDuck d = (LegacyDuck) obj;
// cast because no generics
        return name.compareTo(d.name);
    }
}