package QuestionAndAnswers.q12;

import java.util.concurrent.CyclicBarrier;

class Worker extends Thread {
    CyclicBarrier cb;

    public Worker(CyclicBarrier cb) {
        this.cb = cb;
    }

    public void run() {
        try {
            cb.await();
            System.out.println("Worker...");
        } catch (Exception ex) {
        }
    }
}