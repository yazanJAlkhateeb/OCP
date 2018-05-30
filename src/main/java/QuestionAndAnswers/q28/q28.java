package QuestionAndAnswers.q28;

import java.util.concurrent.*;

public class q28 {
    //Given the code fragment:


    //and
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(4);
        //line n1
        Future f1 = es.submit(new CallerThread("Call"));
        String str = f1.get().toString();
        System.out.println(str);
    }
}
    //Which statement is true?
    //A. The program prints Call Call and terminates.
    //B. The program prints Call Call and does not terminate.///answer
    //C. A compilation error occurs at line n1.
    //D. An ExecutionException is thrown at run time.

