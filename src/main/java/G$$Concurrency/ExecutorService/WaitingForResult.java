package G$$Concurrency.ExecutorService;

import java.util.concurrent.*;

public class WaitingForResult {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service=null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<String> future = (Future<String>) service.submit(() -> System.out.println("Hello Zoo"));
            String s = future.get();
            System.out.println(s);
        }finally {
            assert service != null;
            service.shutdown();
        }
    }
}
