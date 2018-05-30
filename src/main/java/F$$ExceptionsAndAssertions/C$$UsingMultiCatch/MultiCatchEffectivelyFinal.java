package F$$ExceptionsAndAssertions.C$$UsingMultiCatch;

public class MultiCatchEffectivelyFinal {

    /*This try statement is legal. It is a bad idea to reassign the variable in a catch block, but it
is allowed:
try {
// do some work
} catch(RuntimeException e) {
e = new RuntimeException();
}
Using Multi-catch
When adding multi-catch, this pattern is no longer allowed:
try {
throw new IOException();
} catch(IOException | RuntimeException e) {
e = new RuntimeException();
// DOES NOT COMPILE
}
With multi-catch, we no longer have a specific type of exception. Java uses the common
Exception superclass for the variable internally. However, the intent isn’t really to have any
old random exception in there. It wouldn’t make sense to shove an IllegalStateException
in e . That would just make the code more complicated. Imagine that you wanted to rethrow
the exception and it could be any old type. To avoid these problems and complexity, Java
forbids reassigning the exception variable in a multi-catch situation.
This is scarcely a hardship given that it is bad practice to reassign the variable to begin
with! Since Java is big on backward compatibility, this bad practice is still permitted
when catching a single exception type.*/
}
