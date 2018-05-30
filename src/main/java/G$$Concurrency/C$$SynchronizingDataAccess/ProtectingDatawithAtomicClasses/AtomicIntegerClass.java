package G$$Concurrency.C$$SynchronizingDataAccess.ProtectingDatawithAtomicClasses;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerClass {
    private AtomicInteger sheepCount = new AtomicInteger(0);

    public static void main(String[] args) {

        new AtomicIntegerClass().incrementAndReport();
    }

    private void incrementAndReport() {
        System.out.print(sheepCount.incrementAndGet() + " ");
    }
}
