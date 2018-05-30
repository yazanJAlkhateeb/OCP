package H$$IO.C$$WorkingwithStreams;

import java.io.*;

public class TheBufferedInputStreamandBufferedOutputStreamClasses {

    /*
    Why Use the Buffered Classes?
Although we could have rewritten our earlier examples to use byte arrays without
introducing the Buffered classes, we chose to present them together. In practice, it’s
quite common to use Buffered classes anytime you are reading or writing data with
byte arrays. The Buffered classes contain numerous performance enhancements for
managing stream data in memory
     */
    public static void copy(File source, File destination) throws IOException {
        try (
                InputStream in = new BufferedInputStream(new FileInputStream(source));
                OutputStream out = new BufferedOutputStream(
                        new FileOutputStream(destination))) {
            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        }
        /*
        Buffer Size Tuning
We chose a buffer size of 1024 in this example, as this is appropriate for a wide variety
of circumstances, although in practice you may see better performance with a larger or
smaller buffer size. This would depend on a number of factors including file system block
size and CPU hardware.
It is also common to choose a power of 2 for the buffer size, since most underlying
hardware is structured with file block and cache sizes that are a power of 2. The Buffered
classes allow you to specify the buffer size in the constructor. If none is provided, they
use a default value, which is a power of 2 in most JVMs.
Regardless of which buffer size you choose, the biggest performance increase you will
see is moving from nonbuffered to buffered file access. Adjusting the buffer size may
improve performance slightly, but unless you are using an extremely small or extremely
large buffer size, it is unlikely to have a significant impact.
         */
    }
}
