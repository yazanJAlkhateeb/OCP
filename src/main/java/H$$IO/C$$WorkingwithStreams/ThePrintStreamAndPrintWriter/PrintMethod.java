package H$$IO.C$$WorkingwithStreams.ThePrintStreamAndPrintWriter;

import H$$IO.C$$WorkingwithStreams.Animal;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintMethod {


    /*   The most basic of the print-based methods is print() , which is overloaded with all
       Java primitives as well as String and Object . In general, these methods perform
   String.valueOf() on the argument and call the underlying stream’s write() method,
       although they also handle character encoding automatically. For example, the following
       sets of print / write code are equivalent:*/

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("zoo.log");
        out.print(5); // PrintWriter method
        out.write(String.valueOf(5)); // Writer method
        out.print(2.0); // PrintWriter method
        out.write(String.valueOf(2.0)); // Writer method
        Animal animal = new Animal("",5,'c');
        out.print(animal); // PrintWriter method
        out.write(animal == null ? "null" : animal.toString()); // Writer method


    }
}