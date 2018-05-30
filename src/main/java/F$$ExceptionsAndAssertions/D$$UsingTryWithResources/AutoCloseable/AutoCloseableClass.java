package F$$ExceptionsAndAssertions.D$$UsingTryWithResources.AutoCloseable;

public class AutoCloseableClass {

    static class TurkeyCage implements AutoCloseable {
        public void close() {
            System.out.println("Close gate");
        }
        public static void main(String[] args) {
            try (TurkeyCage t = new TurkeyCage()) {
                System.out.println("put turkeys in");
            }
        }

        /*This interface requires a close() method to be implemented,*/
       /* Wait— TurkeyCage didn’t throw an Exception . That’s OK because an overriding method
        is allowed to declare more specific exceptions than the parent or even none at all. By declar-
        ing Exception , the AutoCloseableWithException interface is saying that implementers may throw any
        exceptions they choose*/

    }
}
