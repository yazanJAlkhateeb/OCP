package F$$ExceptionsAndAssertions.F$$WorkingwithAssertions;

public class AssertionsShouldNotAlterOutcomes {
    /*Because assertions can, should, and probably will be turned off in a production environ-
ment, your assertions should not contain any business logic that affects the outcome of
your code. For example, the following assertion is not a good design because it alters the
value of a variable:
int x = 10;
assert ++x > 10;
// Not a good design!*/

    /*When assertions are turned on, x is incremented to 11 ; but when assertions are turned
off, the value of x is 10 . This is not a good use of assertions because the outcome of the
code will be different depending on whether assertions are turned on.*/
}
