package C$$GenericsandCollections.C$$ComparatorVSComparable;

import java.util.Comparator;

public class EasierWayofComparingMultipleFields {

    /*we can compare 2 fields by the following*/

    /*When writing a Comparator that compares multiple instance variables, the code gets a
little messy. Suppose that we have a Squirrel class and assume that the species name
will never be null . We could write a constructor to enforce that if we wanted to:*/
    class Squirrel {
        private int weight;
        private String species;

        public Squirrel(String theSpecies) {
            if (theSpecies == null) throw new IllegalArgumentException();
            species = theSpecies;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getSpecies() {
            return species;
        }


    }

    class ChainingComparator implements Comparator<Squirrel> {
        public int compare(Squirrel s1, Squirrel s2) {
            Comparator<Squirrel> c = Comparator.comparing(Squirrel::getSpecies).thenComparing(Squirrel::getWeight);
            return c.compare(s1, s2);
        }
    }
}
