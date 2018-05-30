package D$$FunctionalProgramming.D$$WorkingwithAdvancedStreamPipelineConcepts;

import java.util.Optional;
import java.util.stream.Stream;

public class ChainingOptionals {
    public static void main(String[] args) {

  /*Now suppose that we wanted to get an Optional<Integer> representing the length of
the String contained in another Optional . Easy enough:*/
  Optional<String> optional= Stream.of("d","w","de").findAny();
        Optional<Integer> result = optional.map(String::length);
        System.out.println(result.get());
    }
    //sample without operation chaining
    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) {
// outer if
            Integer num = optional.get();
            String string = "" + num;
            if (string.length() == 3)
// inner if
                System.out.println(string);
        } }
///sample with operation chaining
private static void threeDigitWithFunctioalProg(Optional<Integer> optional) {
    optional.map(n -> "" + n)
// part 1
            .filter(s -> s.length() == 3)
// part 2
            .ifPresent(System.out::println);
// part 3

}
}
