package F$$ExceptionsAndAssertions.D$$UsingTryWithResources.SuppressedExceptions;

public class Concept2 {
    /*Keep in mind that the catch block looks for matches on the primary exception. What do
you think this code prints?

try (JammedTurkeyCage t = new JammedTurkeyCage()) {
throw new RuntimeException("turkeys ran off");
} catch (IllegalStateException e) {
System.out.println("caught: " + e.getMessage());
}
Line 23 throws the primary exception. Java again calls the close() method and adds a
suppressed exception. Line 24 would catch an IllegalStateException . However, we don’t
have one of those. The primary exception is a RuntimeException . Since this does not match
the catch clause, the exception is thrown to the caller. Eventually the main method would
output something like the following:
Exception in thread "main" java.lang.RuntimeException: turkeys ran off
atJammedTurkeyCage.main(JammedTurkeyCage.java:20)
Suppressed: java.lang.IllegalStateException: Cage door does not close*/
}
