package F$$ExceptionsAndAssertions.D$$UsingTryWithResources.AutoCloseable;

public class NotAutoCloseable {
    static class Turkey {
        public static void main(String[] args) {
            //   try (Turkey t = new Turkey()) { // DOES NOT COMPILE
            //   System.out.println(t);
        }
    }
}
    /*Java doesn’t allow this. It has no idea how to close a Turkey . Java informs us of this fact
with a compiler error:
The resource type Turkey does not implement java.lang.AutoCloseableWithException*/


