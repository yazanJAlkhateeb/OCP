package G$$Concurrency.B$$CreatingThreadswiththeExecutorService.B$$ShuttingDownAThreadExecutor;

public class Concept {
    /*
    Once you have finished using a thread executor, it is important that you call the
shutdown() method. A thread executor creates a non-daemon thread on the first task that
is executed, so failing to call shutdown() will result in your application never terminating.
The shutdown process for a thread executor involves first rejecting any new tasks submitted to
the thread executor while continuing to execute any previously submitted tasks. During this time,
calling isShutdown() will return true , while isTerminated() will return false . If a new task is
submitted to the thread executor while it is shutting down, a RejectedExecutionException will
be thrown. Once all active tasks have been completed, isShutdown() and isTerminated() will
both return true .
     */
}
