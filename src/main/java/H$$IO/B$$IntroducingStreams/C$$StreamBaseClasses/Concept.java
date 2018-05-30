package H$$IO.B$$IntroducingStreams.C$$StreamBaseClasses;

public class Concept {

    /*
    The java.io library defines four abstract classes that are the parents of all stream classes
defined within the API: InputStream , OutputStream , Reader , and Writer .

   PrintStream , which is an OutputStream , does not.


One common area where the exam likes to play tricks on you is mixing and matching
stream classes that are not compatible with each other. For example, take a look at each of
the following examples and see if you can determine why they do not compile.

new BufferedInputStream(new FileReader("zoo-data.txt")); // DOES NOT COMPILE

new BufferedWriter(new FileOutputStream("zoo-data.txt")); // DOES NOT COMPILE

new ObjectInputStream(new FileOutputStream("zoo-data.txt")); // DOES NOT COMPILE

new BufferedInputStream(new InputStream());
// DOES NOT COMPILE

     */
}
