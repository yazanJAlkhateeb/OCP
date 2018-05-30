package F$$ExceptionsAndAssertions.A$$ReviewingExceptions;

public class CatchClauses {
    /*Java checks the catch blocks in the order in which they appear. It is illegal to declare
a subclass exception in a catch block that is lower down in the list than a superclass
exception because it will be unreachable code.


Java will not allow you to declare a catch block for a checked exception type
that cannot potentially be thrown by the try clause body. This is again to avoid
unreachable code.*/
}
