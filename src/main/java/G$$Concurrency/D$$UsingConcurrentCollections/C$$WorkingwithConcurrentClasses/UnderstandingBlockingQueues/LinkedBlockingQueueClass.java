package G$$Concurrency.D$$UsingConcurrentCollections.C$$WorkingwithConcurrentClasses.UnderstandingBlockingQueues;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingQueueClass {

    public static void main(String[] args) {
        try {
            BlockingQueue<Integer> blockingQueue = new java.util.concurrent.LinkedBlockingQueue<>();
            blockingQueue.offer(39);
            blockingQueue.offer(3, 4, TimeUnit.SECONDS);
            System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
// Handle interruption
        }
    }
}
