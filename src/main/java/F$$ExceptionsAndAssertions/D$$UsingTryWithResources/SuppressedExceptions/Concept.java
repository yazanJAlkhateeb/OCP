package F$$ExceptionsAndAssertions.D$$UsingTryWithResources.SuppressedExceptions;

public class Concept {
    /*When multiple exceptions are thrown, all but
the first are called suppressed exceptions. The idea is that Java treats the first exception as
the primary one and tacks on any that come up while automatically closing*/
    static class JammedTurkeyCage implements AutoCloseable {
        public static void main(String[] args) {
            try (JammedTurkeyCage t = new JammedTurkeyCage()) {
                throw new IllegalStateException("turkeys ran off");
            } catch (IllegalStateException e) {
                System.out.println("caught: " + e.getMessage());
                for (Throwable t : e.getSuppressed())
                    System.out.println(t.getMessage()+"xs");
            }
        }

        public void close() throws IllegalStateException {
            System.out.println("yazan");
            throw new IllegalStateException("Cage door does not close");
        }
    }
}


