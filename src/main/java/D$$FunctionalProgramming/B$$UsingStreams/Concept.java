package D$$FunctionalProgramming.B$$UsingStreams;

public class Concept {
    /*A stream in Java is a sequence of data. A stream pipeline is the operations that run on a
stream to produce a result.*/

    /*There are three parts to a stream pipeline:*/
    //Source: Where the stream comes from.

    //Intermediate operations: Transforms the stream into another one. There can be as few
    //or as many intermediate operations as you’d like. Since streams use lazy evaluation, the
    //intermediate operations do not run until the terminal operation runs.

    //Terminal operation: Actually produces a result. Since streams can be used only once,
    //the stream is no longer valid after a terminal operation completes.

/*If you try to call System.out.println(stream) , you’ll get something like
java.util.stream.ReferencePipeline$3@4517d9a3 . This is different than
a Collection where you see the contents. You don’t need to know this for
the exam*/
}
