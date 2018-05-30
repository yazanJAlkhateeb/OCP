package D$$FunctionalProgramming.C$$WorkingwithPrimitives.UsingOptionalwithPrimitiveStreams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class averageMethod {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1,10);
        OptionalDouble optional = stream.average();
    }
}
