package H$$IO.B$$IntroducingStreams.B$$StreamNomenclature.B$$LowLevelVSHighLevelStreams;

import java.io.*;

public class Concept {

    /*
    A low-level ::stream connects directly with the source of the data, such as a file, an array,
or a String . Low-level streams process the raw data or resource and are accessed in a
direct and unfiltered manner. For example, a FileInputStream is a class that reads file data
one byte at a time.

Alternatively, a high-level stream is built on top of another stream using wrapping.
Wrapping is the process by which an instance is passed to the constructor of another
class and operations on the resulting instance are filtered and applied to the original
instance.
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("zoo-data.txt"))) {
            System.out.println(bufferedReader.readLine());

    /*
    High-level streams can take other high-level streams as input. For example, although the
following code might seem a little odd at first, the style of wrapping a stream is quite com-
mon in practice:
     */
            try (ObjectInputStream objectStream = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("zoo-data.txt")))) {
                System.out.println(objectStream.readObject());
            }
        }


    }

}
