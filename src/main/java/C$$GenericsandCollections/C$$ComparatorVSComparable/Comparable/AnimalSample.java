package C$$GenericsandCollections.C$$ComparatorVSComparable.Comparable;

public class AnimalSample implements Comparable<AnimalSample> {
    private int id;

    public static void main(String[] args) {
        AnimalSample a1 = new AnimalSample();
        AnimalSample a2 = new AnimalSample();
        a1.id = 5;
        a2.id = 7;
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(a1));
        System.out.println(a2.compareTo(a1));

    }

    public int compareTo(AnimalSample a) {
        return id - a.id;
    }
}