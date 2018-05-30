package G$$Concurrency.B$$CreatingThreadswiththeExecutorService.C$$SubmittingTasks;

public class ConceptAndTable {

    /*
    You can submit tasks to an ExecutorService instance multiple ways. The first method we
presented, execute() , is inherited from the Executor interface, which the ExecutorService
interface extends. The execute() method takes a Runnable lambda expression or instance
and completes the task asynchronously. Because the return type of the method is void , it
does not tell us anything about the result of the task. It is considered a “fire-and-forget”
method, as once it is submitted, the results are not directly available to the calling thread.
Fortunately, the writers of the Java added submit() methods to the ExecutorService inter-
face, which, like execute() , can be used to complete tasks asynchronously. Unlike execute() ,
though, submit() returns a Future object that can be used to determine if the task is complete.
It can also be used to return a generic result object after the task has been completed.
Table 7.2 shows the five methods, including execute() and two submit() methods,
which you should know for the exam.

Method Name                          Description
void execute(Runnable command)         Executes a Runnable task at some
                                              point in the futureCreating Threads with the ExecutorService

Future<?> submit(Runnable task)              Executes a Runnable task at some
                                            point in the future and returns a Future
                                            representing the task
<T> Future<T> submit(Callable<T> task)      Executes a Callable task at some
                                            point in the future and returns a Future
                                            representing the pending results of the
                                                task
<T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks)
            throws InterruptedException Executes the given tasks, synchro-nously returning the results of all tasks
                as a Collection of Future objects, inthe same order they were in the original collection

<T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException,
                                                         ExecutionException Executes the given tasks, synchronously
                                                        returning the result of one of finished tasks, cancelling any
                                                        unfinished tasks
     */
}
