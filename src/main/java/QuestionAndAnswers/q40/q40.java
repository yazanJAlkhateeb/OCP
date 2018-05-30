package QuestionAndAnswers.q40;

public class q40 {
    // Given:
    static class UserException extends Exception {
    }

    static class AgeOutOfLimitException extends UserException {
    }

    //  and the code fragment:
    static class App {
        public static void main(String[] args) throws UserException {
            App t = new App();
            t.doRegister("Mathew", 60);
        }

        public void doRegister(String name, int age) throws UserException, AgeOutOfLimitException {
            if (name.length() < 6) {
                throw new UserException();
            } else if (age >= 60) {
                throw new AgeOutOfLimitException();
            } else {
                System.out.println("User is registered.");
            }
        }
    }
   /* What is the result?
        A. User is registered.
        B. An AgeOutOfLimitException is thrown.//answer
        C. A UserException is thrown.
        D. A compilation error occurs in the main method.*/
}
