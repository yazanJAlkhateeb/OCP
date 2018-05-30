package D$$FunctionalProgramming.B$$UsingStreams.D$$PuttingTogetherThePipeline;

import java.util.stream.Stream;

public class ProgrammeWillHang {
    public static void main(String[] args) {
//        Make sense? Let’s try two more examples to make sure that you understand this well.
      //          What do you think the following does?
                Stream.generate(() -> "Elsa")
                        .filter(n -> n.length() == 4)
                        .sorted()
                        .limit(2)
                        .forEach(System.out::println);
     //   It actually hangs until you kill the program or it throws an exception after running out
        //of memory. The foreman has instructed sorted() to wait until everything to sort is present.

                            /*Other Example*/

        Stream.generate(() -> "Olaf Lazisson")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);
      //  This one hangs as well until we kill the program. The filter doesn’t allow anything
      //  through, so limit() never sees two elements. This means that we have to keep waiting and
       // hope that they show up.
    }
}
