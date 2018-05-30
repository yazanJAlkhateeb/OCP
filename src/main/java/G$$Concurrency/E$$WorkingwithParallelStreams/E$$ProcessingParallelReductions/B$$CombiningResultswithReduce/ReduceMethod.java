package G$$Concurrency.E$$WorkingwithParallelStreams.E$$ProcessingParallelReductions.B$$CombiningResultswithReduce;

import java.util.Arrays;

public class ReduceMethod {
    public static void main(String[] args) {


        String reduce = Arrays.asList('w', 'o', 'l', 'f')
                .stream()
                .reduce("x",
                        (c, s1) -> c + s1,
                        (s2, s3) -> s2 + s3);
        System.out.println(reduce);
    }
}
