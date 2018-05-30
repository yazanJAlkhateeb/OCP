package D$$FunctionalProgramming.B$$UsingStreams.C$$UsingCommonIntermediateOperations;

import B$$DesignPatternsandPrinciples.B$$IntroducingFunctionalProgramming.DefiningaFunctionalInterface.ImplementingFunctionalInterfaceswithLambdas.LamdaExampleWithPredicate.Animal;

import java.util.Comparator;
import java.util.stream.Stream;

public class sortedMETHOD {
//The sorted() method returns a stream with the elements sorted. Just like sorting arrays,
//Java uses natural ordering unless we specify a comparator. The method signatures are
//these:
//Stream<T> sorted()
//Stream<T> sorted(Comparator<? super T> comparator)

    public static void main(String[] args) {
        Stream<String> s = Stream.of("brown-", "bear-");
        s.sorted().forEach(System.out::print);
        System.out.println();
        //Remember that we can pass a lambda expression as the comparator. For example, we
        //can pass a Comparator implementation:
        Stream<Animal> v = Stream.of(new Animal("ad",true,true),new Animal("dd",true,true));
        v.sorted(Comparator.comparing(i->i.canHop()))
        .forEach(System.out::print);
    }

}
