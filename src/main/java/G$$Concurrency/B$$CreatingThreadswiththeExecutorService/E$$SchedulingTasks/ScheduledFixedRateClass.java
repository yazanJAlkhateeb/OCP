package G$$Concurrency.B$$CreatingThreadswiththeExecutorService.E$$SchedulingTasks;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledFixedRateClass {
    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> System.out.println("Hello Zoo");
        service.scheduleAtFixedRate(task1, 5, 1, TimeUnit.MINUTES);
    }
}
