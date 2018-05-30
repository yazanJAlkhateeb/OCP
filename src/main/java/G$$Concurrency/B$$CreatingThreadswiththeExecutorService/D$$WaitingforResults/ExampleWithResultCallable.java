package G$$Concurrency.B$$CreatingThreadswiththeExecutorService.D$$WaitingforResults;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class
ExampleWithResultCallable {
    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<Integer> result = service.submit(() ->{return  30 + 11;});
            System.out.println(result.get());
        } finally {
            if (service != null) service.shutdown();
        }
    }
}