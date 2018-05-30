package G$$Concurrency.B$$CreatingThreadswiththeExecutorService.E$$SchedulingTasks;

public class ConceptSchedule {
    /*
    Like ExecutorService , we obtain an instance of ScheduledExecutorService using a
factory method in the Executors class, as shown in the following snippet:
ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
Note that we could implicitly cast an instance of ScheduledExecutorService to
ExecutorService , although doing so would remove access to the scheduled methods that
we want to use.346

Concurrency
Refer to Table 7.5 for our discussion of ScheduledExecutorService methods.
Ta b l e   7. 5
ScheduledExecutorService methods
Method Name                            Description
schedule(Callable<V> callable,long delay, TimeUnit unit)                            Creates and executes a Callable task after the given delay

schedule(Runnable command,long delay, TimeUnit unit)                                Creates and executes a Runnable task after the given
                                                                                       delay
scheduleAtFixedRate(Runnable command, long initialDelay,long period, TimeUnit unit) Creates and executes a Runnable task after the given
                                                                                    initial delay, creating a new task every period value that
                                                                                        passes.
scheduleAtFixedDelay(Runnable command, long initialDelay,long delay, TimeUnit unit)     Creates and executes a Runnable task after the given
                                                                                    initial delay and subsequently with the given delay

                                                                                          between the termination of one execution and the com-

                                                                                                                    mencement of the next
     */
}
