package B$$DesignPatternsandPrinciples.B$$IntroducingFunctionalProgramming.DefiningaFunctionalInterface.ImplementingFunctionalInterfaceswithLambdas.LamdaExampleWithoutPredicate;

public class FindMatchingAnimals {
    private static void print(Animal animal, CheckTrait trait) {
        if (trait.test(animal))
            System.out.println(animal);
    }

    public static void main(String[] args) {
        print(new Animal("fish", false, true), Animal::canHop);
        print(new Animal("kangaroo", true, false), a -> a.canHop());
    }
}