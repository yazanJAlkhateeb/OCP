package QuestionAndAnswers.q90;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class q90 {
    static class Bird {
        public void fly () { System.out.print("Can fly"); }
    }
    static class Penguin extends Bird {
        public void fly () { System.out.print("Cannot fly"); }
    }
   // and the code fragment:
   static class Birdie {
        public static void main (String [ ] args) {
            fly( ( ) -> new Bird ( ));
            fly (Penguin::new);
        }
        /* line n1 */
        static void fly (Supplier<? extends Bird> bird) {
            bird.get().fly();
        }
    }
}
