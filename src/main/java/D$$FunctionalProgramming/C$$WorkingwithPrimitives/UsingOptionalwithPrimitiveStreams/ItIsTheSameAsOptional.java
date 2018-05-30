package D$$FunctionalProgramming.C$$WorkingwithPrimitives.UsingOptionalwithPrimitiveStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ItIsTheSameAsOptional {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1,10);
        OptionalDouble optional = stream.average();
        optional.ifPresent(System.out::println);
        System.out.println(optional.getAsDouble());
        System.out.println(optional.orElseGet(() -> Double.NaN));
      //  The only noticeable difference is that we called getAsDouble() ra
    }
    private static int max(IntStream ints) {
        OptionalInt optional = ints.max();
        return optional.orElseThrow(RuntimeException::new);
    }
}

