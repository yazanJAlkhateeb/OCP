package C$$GenericsandCollections.C$$ComparatorVSComparable.Comparable;

public class compareToANDequalsConsistency {
    /*You are strongly encouraged to make your Compara-
ble classes consistent with equals because not all collection classes behave predictably if
the compareTo() and equals() methods are not consistent.

For example, the following Product class defines a compareTo() method that is not con-
sistent with equals:*/

    class Product implements Comparable<Product> {
        int id;
        String name;

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Product)) {
                return false;
            }
            Product other = (Product) obj;
            return this.id == other.id;
        }

        @Override
        public int compareTo(Product obj) {
            return this.name.compareTo(obj.name);
        }
    }
}
