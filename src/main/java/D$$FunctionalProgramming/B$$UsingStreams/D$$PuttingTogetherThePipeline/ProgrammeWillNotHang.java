package D$$FunctionalProgramming.B$$UsingStreams.D$$PuttingTogetherThePipeline;

import java.util.stream.Stream;

public class ProgrammeWillNotHang {

    public static void main(String[] args) {
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);
       // This one prints Elsa twice. The filter lets elements through and limit() stops the earlier
       // operations after two elements
    }
}
