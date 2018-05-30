package F$$ExceptionsAndAssertions.F$$WorkingwithAssertions;

public class AssertionsSample {
public static void main(String[] args) {
int numGuests = -5;
assert numGuests > 0;
System.out.println(numGuests);
}

/*The program ends with a stack trace similar to this:
Exception in thread "main" java.lang.AssertionError
at asserts.Assertions.main(Assertions.java:7)*/
}