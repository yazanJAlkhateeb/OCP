package H$$IO.B$$IntroducingStreams.D$$CommonStreamOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MarkingtheStream {
/*
The InputStream and Reader classes include mark(int) and reset() methods to move
the stream back to an earlier position. Before calling either of these methods, you shouldIntroducing Streams
419
call the markSupported() method, which returns true only if mark() is supported
 */
public static void main(String[] args) throws IOException {
    InputStream is = new FileInputStream("zoo.txt");
    System.out.print ((char)is.read());
    if(is.markSupported()) {
        is.mark(100);
        System.out.print((char)is.read());
        System.out.print((char)is.read());
        is.reset();
    }
    System.out.print((char)is.read());
    System.out.print((char)is.read());
    System.out.print((char)is.read());

    /*
    Notice that regardless of whether the mark() operation was supported, we took care to
have the stream end at the same position.
Finally, if you call reset() after you have passed your mark() read limit, an exception
may be thrown at runtime since the marked position may become invalidated. We say “an
exception may be thrown” as some implementations may use a buffer to allow extra data
to be read before the mark is invalidated.
     */
}
}
