package H$$IO.C$$WorkingwithStreams.ThePrintStreamAndPrintWriter;

public class ThePrintStreamandPrintWriterClasses {

    /*
    The PrintStream and PrintWriter classes are high-level stream classes that write
formatted representation of Java objects to a text-based output stream.
     */

    /*
    the PrintStream class operates on OutputStream instances and
writes data as bytes, whereas the PrintWriter class operates on Writer instances and
writes data as characters.
     */

    /*
    both of these classes include constructors that can open and write
to files directly
     */

    /*
    For the exam, you should be aware that
System.out and System.err are actually PrintStream objects.
     */
    /*
    you should be familiar with the print() , println() , format() ,
and printf() methods. Unlike the underlying write() method, which throws a checked
IOException that must be caught in your application,
     */

    /*
    we will use PrintWriter in our examples, as writing String
data as characters instead of byte values is recommended. Keep in mind that the same
examples could be easily rewritten with a PrintStream object.
     */
}
