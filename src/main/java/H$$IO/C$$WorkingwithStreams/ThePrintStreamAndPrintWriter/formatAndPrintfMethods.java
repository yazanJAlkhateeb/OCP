package H$$IO.C$$WorkingwithStreams.ThePrintStreamAndPrintWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;

public class formatAndPrintfMethods {
/*
the format() method in
PrintStream and PrintWriter takes a String , an optional locale, and a set of arguments,
and it writes a formatted String to the stream based on the input. In other words, it is a
convenience method for formatting directly to the stream.
 */
    public static void main(String[] args) throws FileNotFoundException {
      try (PrintWriter printWriter=new PrintWriter("Zoo.log")){

          printWriter.format("079%s", 1501993);
      }
        //printWriter.printf("",Locale.getDefault());


    }
}
