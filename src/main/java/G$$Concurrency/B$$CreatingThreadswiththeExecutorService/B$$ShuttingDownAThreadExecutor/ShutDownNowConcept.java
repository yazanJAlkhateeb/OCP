package G$$Concurrency.B$$CreatingThreadswiththeExecutorService.B$$ShuttingDownAThreadExecutor;

public class ShutDownNowConcept {

    /*
    For the exam, you should be aware that shutdown() does not actually stop any tasks that
have already been submitted to the thread executor. What if you want to cancel all running
and upcoming tasks? The ExecutorService provides a method called shutdownNow() , which
attempts to stop all running tasks and discards any that have not been started yet. Note
that shutdownNow() attempts to stop all running tasks. It is possible to create a thread that
will never terminate, so any attempt to interrupt it may be ignored. Lastly, shutdownNow()
returns a List<Runnable> of tasks that were submitted to the thread executor but that were
never started.
     */
}
