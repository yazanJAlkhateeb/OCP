package G$$Concurrency.ExecutorService;

import java.util.concurrent.TimeoutException;

public class tst implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++);
        try {
            throw new TimeoutException();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
