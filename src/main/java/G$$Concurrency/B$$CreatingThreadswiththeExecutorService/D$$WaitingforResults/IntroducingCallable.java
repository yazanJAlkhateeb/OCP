package G$$Concurrency.B$$CreatingThreadswiththeExecutorService.D$$WaitingforResults;

public class IntroducingCallable {

    /*
    When the Concurrency API was released in Java 5, the new java.util.concurrent.
Callable interface was added, or Callable for short, which is similar to Runnable except
that its call() method returns a value and can throw a checked exception. As you may
remember from the definition of Runnable , the run() method returns void and cannot
throw any checked exceptions. Along with Runnable , Callable was also made a functional
interface in Java 8. The following is the definition of the Callable interface:
@FunctionalInterface public interface Callable<V> {
V call() throws Exception;
}
The Callable interface was introduced as an alternative to the Runnable interface,
since it allows more details to be retrieved easily from the task after it is completed. The
ExecutorService includes an overloaded version of the submit() method that takes a
Callable object and returns a generic Future<T> object.
     */
}
