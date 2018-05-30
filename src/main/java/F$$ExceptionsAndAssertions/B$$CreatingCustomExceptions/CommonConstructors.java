package F$$ExceptionsAndAssertions.B$$CreatingCustomExceptions;

/*The following example shows the three most common constructors defined by the
Exception class:*/
public class CommonConstructors {
    class CannotSwimException extends Exception {
        public CannotSwimException() {
            super();
        }

        public CannotSwimException(Exception e) {
            super(e);
        }

        public CannotSwimException(String message) {
            super(message);
        }
    }
    /*The first constructor is the default constructor with no parameters. The second
constructor shows how to wrap another exception inside yours. The third constructor
shows how to pass a custom error message.*/

    /*Using a different constructor allows you to provide more information about what went
wrong. We would get output like this if we wrote a main method with the line throw new
CannotSwimException(); :
Exception in thread "main" CannotSwimException
at CannotSwimException.main(CannotSwimException.java:18)

This gives us just the exception and location. Now we change the main method to wrap
an exception using the line throw new CannotSwimException(new RuntimeException()); :
Exception in thread "main" CannotSwimException: java.lang.RuntimeException
at CannotSwimException.main(CannotSwimException.java:19)
Caused by: java.lang.RuntimeException
... 1 more

This time, we fi nd the underlying RuntimeException as well. Finally, we change the main
method to pass a message using the line throw new CannotSwimException("broken fin"); :
Exception in thread "main" CannotSwimException: broken fin
at CannotSwimException.main(CannotSwimException.java:20)
This time we see the message text in the result.*/
}
