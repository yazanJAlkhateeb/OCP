package F$$ExceptionsAndAssertions.D$$UsingTryWithResources;

import java.util.Scanner;

public class TryWithResourceScope {
    /*The resources created in the try clause are only in scope within the try block. This is
another way to remember that the implicit finally runs before any catch / finally blocks
that you code yourself. The implicit close has run already, and the resource is no longer
available*/
    public static void main(String[] args) {


        try (Scanner s = new Scanner(System.in)) {
            s.nextLine();
        } catch (Exception e) {
      //      s.nextInt(); // DOES NOT COMPILE
        } finally {
       //     s.nextInt(); // DOES NOT COMPILE

        }
    }
}
