package D$$FunctionalProgramming.B$$UsingStreams.B$$UsingCommonTerminalOperations.collectMethod;

import java.util.TreeSet;
import java.util.stream.Stream;

public class CollectWith3Args {
/*method signatures are as follows:
<R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator,
BiConsumer<R, R> combiner)*/

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(StringBuilder::new,
                StringBuilder::append, StringBuilder::append);

        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream2.collect(TreeSet::new, TreeSet::add,
                TreeSet::addAll);
        System.out.println(set); // [f, l, o, w]

        //The first parameter is a Supplier that creates the object that will store the results as we
        //collect data. Remember that a Supplier doesn’t take any parameters and returns a value.
        //In this case, it constructs a new StringBuilder

        //The second parameter is a BiConsumer , which takes two parameters and doesn’t return
        //anything. It is responsible for adding one more element to the data collection

        //The final parameter is another BiConsumer . It is responsible for taking two data collec-
        //tions and merging them. This is useful when we are processing in paralle
    }
}
