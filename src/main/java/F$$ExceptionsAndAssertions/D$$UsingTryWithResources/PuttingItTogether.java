package F$$ExceptionsAndAssertions.D$$UsingTryWithResources;

public class PuttingItTogether {
  /*  You’ve learned two new rules for the order in which code runs in a try-with-resources
    statement:
            ■ ■ Resources are closed after the try clause ends and before any catch / finally clauses.

            ■ ■ Resources are closed in the reverse order from which they were created.*/

    /*Based on these rules, can you figure out what this code prints?*/
    static class Auto implements AutoCloseable {
        int num;

        Auto(int num) {
            this.num = num;
        }
        public void close() {
            System.out.println("Close: " + num);
        }

        public static void main(String[] args) {
            try (Auto a1 = new Auto(1); Auto a2 = new Auto(2)) {
                throw new RuntimeException();
            } catch (Exception e) {
                System.out.println("ex");
            } finally {
                System.out.println("finally");
            }
        }


    }
/*
Since the resources are closed in the reverse order from which they were opened, we have
Close: 2 and then Close: 1 . After that, the catch block and finally block are run—just
as they are in a regular try statement. The output is
Close: 2
Close: 1
ex
finally*/
}
