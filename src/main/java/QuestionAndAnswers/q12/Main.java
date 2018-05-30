package QuestionAndAnswers.q12;

import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {
        Master master = new Master();
//line n2
        CyclicBarrier cb = new CyclicBarrier(1, master);
        Worker worker = new Worker(cb);
        worker.start();
    }
}
