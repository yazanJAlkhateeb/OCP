package QuestionAndAnswers.q104;

import java.util.concurrent.atomic.AtomicInteger;

//Given the code fragments:
class MyThread implements Runnable {
    private static AtomicInteger count = new AtomicInteger(0);

    public void run() {
        int x = count.incrementAndGet();
        System.out.print(x + " ");
    }

    //and
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        Thread thread3 = new Thread(new MyThread());
        Thread[] ta = {thread1, thread2, thread3};
        for (int x = 0; x < 3; x++) {
            ta[x].start();
        }
    }
}
/*Which statement is true?
A. The program prints 1 2 3 and the order is unpredictable.///answer
B. The program prints 1 2 3.
C. The program prints 1 1 1.
D. A compilation error occurs.*/