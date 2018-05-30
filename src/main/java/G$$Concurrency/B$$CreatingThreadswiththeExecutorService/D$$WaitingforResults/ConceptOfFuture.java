package G$$Concurrency.B$$CreatingThreadswiththeExecutorService.D$$WaitingforResults;

public class ConceptOfFuture {
    /*
    How do we know when a task submitted to an ExecutorService is complete? As mentioned
 in the last section, the submit() method returns a java.util.concurrent.
Future<V> object, or Future<V> for short, that can be used to determine this result:
Future<?> future = service.submit(() -> System.out.println("Hello Zoo"));
The Future class includes methods that are useful in determining the state of a task, as
shown in Table 7.3.
Ta b l e   7. 3     Future methods
Method Name                       Description
boolean isDone()                  Returns true if the task was completed, threw an exception, or
                                  was cancelled.
boolean isCancelled()             Returns true if the task was cancelled before it completely
                                    ­ ormally.
n
boolean cancel()                     Attempts to cancel execution of the task.
V get()                              Retrieves the result of a task, waiting endlessly if it is not yet
                                    available.
V get(long timeout,TimeUnit unit)   Retrieves the result of a task, waiting the specified amount
                                    of time. If the result is not ready by the time the timeout is
                                    reached, a checked TimeoutException will be thrown.
     */
}
