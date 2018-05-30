package G$$Concurrency.B$$CreatingThreadswiththeExecutorService.F$$IncreasingConcurrencywithPools;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Concept {

    /*
    We now present three additional factory methods in the Executors class that act on a
pool of threads, rather than on a single thread. A thread pool is a group of pre-instantiated
reusable threads that are available to perform a set of arbitrary tasks. Table 7.6 includes
our two previous single-thread executor methods, along with the new ones that you should
know for the exam.



Ta b l e   7. 6     Executors methods
Method Name                 Return              Type Description
newSingleThreadExecutor()   ExecutorService      Creates a single-threaded executor that
                                                uses a single worker thread operating
                                                off an unbounded queue. Results are
                                                 processed sequentially in the order in
                                                    which they are submitted.
newSingleThreadScheduledExecutor()              Scheduled
                                                            ExecutorService Creates a single-threaded executor that
                                                        can schedule commands to run after a
                                                    given delay or to execute periodically.
newCachedThreadPool()           ExecutorService     Creates a thread pool that creates new
                                                    threads as needed, but will reuse previ-
                                                    ously constructed threads when they
                                                        are available.
newFixedThreadPool(int nThreads) ExecutorService     Creates a thread pool that reuses a
                                                            fixed number of threads operating off a
                                                        s                                                                   hared unbounded queue.
newScheduledThreadPool(int nThreads) Scheduled
                                                        ExecutorService Creates a thread pool that can schedule
                                                        commands to run after a given delay or
                                                       to execute periodically.
     */
    public static void main(String[] args) {

        Runnable command = () -> System.out.println("");
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
        service.scheduleAtFixedRate(command, 3, 1, TimeUnit.MINUTES);
    }
}
