package F$$ExceptionsAndAssertions.D$$UsingTryWithResources.AutoCloseable;

public class AutoCloseableWithException {
    static class StuckTurkeyCage implements AutoCloseable {
        public void close() throws Exception {
            throw new Exception("Cage door does not close");
        }
        public static void main(String[] args) {
         //   try (StuckTurkeyCage t = new StuckTurkeyCage()) {
            // DOES NOT COMPILE
                System.out.println("put turkeys in");
            }
        }
    }

    /*The try-with-resources statement throws a checked exception. And you know that
checked exceptions need to be handled or declared. Tricky isn’t it? This is something that
you need to watch for on the exam. If the main() method declared an Exception , this code
would compile.*/
