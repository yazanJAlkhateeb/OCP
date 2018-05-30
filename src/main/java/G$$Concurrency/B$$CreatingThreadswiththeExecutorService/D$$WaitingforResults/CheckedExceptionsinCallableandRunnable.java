package G$$Concurrency.B$$CreatingThreadswiththeExecutorService.D$$WaitingforResults;

public class CheckedExceptionsinCallableandRunnable {
    /*
    Besides having a return type, the Callable interface also supports checked exceptions,
whereas the Runnable interface does not without an embedded try/catch block. Given
an instance of ExecutorService called service , which of the following lines of code will
or will not compile?
service.submit(() -> {Thread.sleep(1000); return null;});
service.submit(() -> {Thread.sleep(1000);});
The first line will compile, while the second line will not. Why? Recall that Thread.
sleep() throws a checked InterruptedException . Since the first lambda expression
has a return type, the compiler treats this as a Callable expression that supports
checked exceptions. The second lambda expression does not return a value; therefore,
the compiler treats this as a Runnable expression. Since Runnable methods do not sup-
port checked exceptions, the compiler will report an error trying to compile this code
snippet.
     */
}
