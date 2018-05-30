package B$$DesignPatternsandPrinciples.C$$ImplementingPolymorphism;

public class CastNOTInstanceObject {
   /* Casting is not without its limitations. Even though two classes share a related hierar-
    chy, that doesn’t mean an instance of one can automatically be cast to another. Here’s an
    example:*/
    public static class Rodent {
    }

    public static class Capybara extends Rodent {
        int yazan;
        public static void main(String[] args) {
            Capybara capybara = new Capybara();
            Rodent rodent = new Rodent();
            Capybara cpybara = (Capybara)rodent;




// runtime
        }
    }
    /*This code creates an instance of Rodent and then tries to cast it to a subclass of
    Rodent, Capybara. Although this code will compile without issue, it will throw a
    ClassCastException at runtime since the object being referenced is not an instance of the
    Capybara class*/
}
