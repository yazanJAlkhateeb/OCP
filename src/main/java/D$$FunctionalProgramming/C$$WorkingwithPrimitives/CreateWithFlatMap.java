package D$$FunctionalProgramming.C$$WorkingwithPrimitives;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CreateWithFlatMap {
/*You can also create a primitive stream from a Stream using flatMapToInt(),
flatMapToDouble(), or flatMapToLong() . For example, IntStream ints =
*/
public static void main(String[] args) {

    List<Integer> list=Arrays.asList(1,2,3);
    IntStream intStream = list.stream().flatMapToInt(x -> IntStream.of(x));

}
}
