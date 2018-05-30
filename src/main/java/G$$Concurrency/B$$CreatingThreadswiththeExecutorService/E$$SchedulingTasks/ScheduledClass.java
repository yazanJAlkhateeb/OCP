package G$$Concurrency.B$$CreatingThreadswiththeExecutorService.E$$SchedulingTasks;

import java.util.concurrent.*;

public class ScheduledClass {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> System.out.println("Hello Zoo");
        Callable<String> task2 = () -> "Monkey";
        Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
        Future<?> result2 = service.schedule(task2, 8, TimeUnit.SECONDS);
    }
}
