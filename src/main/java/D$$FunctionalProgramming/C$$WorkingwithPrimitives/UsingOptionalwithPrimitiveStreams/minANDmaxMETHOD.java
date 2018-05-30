package D$$FunctionalProgramming.C$$WorkingwithPrimitives.UsingOptionalwithPrimitiveStreams;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class minANDmaxMETHOD {
    public static void main(String[] args) {
        DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
        OptionalDouble min = doubles.min(); // runs infinitely
    }
}
