package G$$Concurrency.C$$SynchronizingDataAccess;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManagerWithSync {
    private int sheepCount = 0;

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepManagerWithSync manager = new SheepManagerWithSync();
            for (int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            if (service != null) service.shutdown();
        }
    }

    private void incrementAndReport() {
        synchronized (this) {
            System.out.print((++sheepCount) + " ");
        }
    }
}