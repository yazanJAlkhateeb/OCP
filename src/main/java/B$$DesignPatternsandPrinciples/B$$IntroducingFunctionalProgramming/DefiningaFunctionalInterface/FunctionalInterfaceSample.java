package B$$DesignPatternsandPrinciples.B$$IntroducingFunctionalProgramming.DefiningaFunctionalInterface;

import H$$IO.C$$WorkingwithStreams.Animal;
@FunctionalInterface
public interface FunctionalInterfaceSample {
    public void sprint(Animal animal);
}
class Tiger implements FunctionalInterfaceSample {
    FunctionalInterfaceSample s=(a)-> System.out.println("Animal is sprinting fast! " );
    public void sprint(Animal animal) {
        System.out.println("Animal is sprinting fast! " + animal.toString());
    }
}
