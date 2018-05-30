package B$$DesignPatternsandPrinciples.C$$ImplementingPolymorphism;

public class CastUnrelatedObject {
  /*  The third rule is important; the exam may try to trick you with a cast that the compiler
    doesn’t allow. For example, we were able to cast a Primate reference to a Lemur reference
    as Lemur is a subclass of Primate and therefore related.
    Consider this example:*/
    public class Bird {}

    public static class Fish {
        public static void main(String[] args) {
            Fish fish = new Fish();
         //   Bird bird = (Fish)bird; // DOES NOT COMPILE
        }
    }
}
