package A$$AdvancedClassDesign.D$$CodingequalsAnDhashCodeAnDtoString.toString;

public class toStringMethod {
    static class Hippo {
        private String name;
        private double weight;
        public Hippo(String name, double weight) {
            this.name = name;
            this.weight = weight;
        }
        @Override
        public String toString() {
            return name;
        }
        public static void main(String[] args) {
            Hippo h1 = new Hippo("Harry", 3100);
// Harry
            System.out.println(h1);
        } }
}
