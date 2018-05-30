package H$$IO.B$$IntroducingStreams.D$$CommonStreamOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SkippingoverData {

    /*
    The InputStream and Reader classes also include a skip(long) method, which as you
might expect skips over a certain number of bytes. It returns a long value, which indicates
the number of bytes that were actually skipped. If the return value is zero or negative, such
as if the end of the stream was reached, no bytes were skipped.
     */

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("");
        System.out.print ((char)is.read());
        is.skip(2);
        is.read();
        System.out.print((char)is.read());
        System.out.print((char)is.read());
    }
}
