package A$$AdvancedClassDesign.F$$CreatingNestedClasses.D$$StaticNestedClasses;

public class Enclosing {
    public static void main(String[] args) {
        Enclosing.Nested nested = new Enclosing.Nested();
        System.out.println(nested.price);
    }

    static class Nested {
        private int price = 6;
    }
}