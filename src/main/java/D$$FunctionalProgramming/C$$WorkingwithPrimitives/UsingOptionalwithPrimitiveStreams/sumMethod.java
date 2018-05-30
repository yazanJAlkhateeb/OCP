package D$$FunctionalProgramming.C$$WorkingwithPrimitives.UsingOptionalwithPrimitiveStreams;

import java.util.stream.LongStream;

public class sumMethod {

    public static void main(String[] args) {
        LongStream longs = LongStream.of(5, 10);
        long sum = longs.sum();
        System.out.println(sum); // 15
    }
}
