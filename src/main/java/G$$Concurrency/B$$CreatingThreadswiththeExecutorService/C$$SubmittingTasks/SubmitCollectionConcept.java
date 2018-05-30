package G$$Concurrency.B$$CreatingThreadswiththeExecutorService.C$$SubmittingTasks;

public class SubmitCollectionConcept {

    /*
    Submitting Task Collections
The last two methods listed in Table 7.2 that you should know for the exam are invokeAll()
and invokeAny() . Both of these methods take a Collection object containing a list of tasks
to execute. Both of these methods also execute synchronously. By synchronous, we mean that
unlike the other methods used to submit tasks to a thread executor, these methods will wait
until the results are available before returning control to the enclosing program.

The invokeAll() method executes all tasks in a provided collection and returns a List of
ordered Future objects, with one Future object corresponding to each submitted task, in the
order they were in the original collection. Even though Future.isDone() returns true for each
element in the returned List , a task could have completed normally or thrown an exception.
The invokeAny() method executes a collection of tasks and returns the result of one of
the tasks that successfully completes execution, cancelling all unfinished tasks. While the
first task to finish is often returned, this behavior is not guaranteed, as any completed task
can be retuults are available before returning control to the enclosing program.rned by this method.
Finally, the invokeAll() method will wait indefinitely until all tasks are complete,
while the invokeAny() method will wait indefinitely until at least one task completes.
The ExecutorService interface also includes overloaded versions of invokeAll() and
invokeAny() that take a timeout value and TimeUnit parameter. We will see how to use
these types of parameters in the next section when discussing the Future class
     */
}
