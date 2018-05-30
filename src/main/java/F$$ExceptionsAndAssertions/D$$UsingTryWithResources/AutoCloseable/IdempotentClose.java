package F$$ExceptionsAndAssertions.D$$UsingTryWithResources.AutoCloseable;

public class IdempotentClose {
    /*Java also recommends to make the close() method
idempotent. Idempotent means that the method can called be multiple times without any
side effects or undesirable behavior on subsequent runs. For example, it shouldn’t throw
an exception the second time or change state or the like. Both these negative practices are
allowed. They are merely discouraged.*/

    static class ExampleThree implements AutoCloseable {
        static int COUNT = 0;

        public void close() {
            COUNT++;
        }
    }

    class ExampleOne implements AutoCloseable {
        public void close() throws IllegalStateException {
            throw new IllegalStateException("Cage door does not close");
        }
    }

    class ExampleTwo implements AutoCloseable {
        public void close() throws Exception {
            throw new Exception("Cage door does not close");
        }
    }/*
    ExampleOne is the best implementation. ExampleTwo throws Exception rather than
    a more specific subclass, which is not recommended. ExampleThree has a side effect. It
    changes the state of a variable. Side effects are not recommended.*/
}
