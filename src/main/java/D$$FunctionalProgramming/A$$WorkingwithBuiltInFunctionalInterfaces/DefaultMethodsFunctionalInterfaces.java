package D$$FunctionalProgramming.A$$WorkingwithBuiltInFunctionalInterfaces;

public class DefaultMethodsFunctionalInterfaces {
    /*By definition, all functional interfaces have a single abstract method. This doesn’t mean
that they have only one method, though. Several of the common functional interfaces
provide a number of helpful default methods. You don’t need to know these for the
exam, but they are helpful when you start building your own implementations out in the
real world.
Suppose that we have these two Predicate s:
Predicate<String> egg = s -> s.contains("egg");
Predicate<String> brown = s -> s.contains("brown");
Now we want a Predicate for brown eggs and another for all other colors of eggs. We
could write this by hand:
Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
Predicate<String> otherEggs = s -> s.contains("egg") && ! s.contains("brown");
This works, but it’s not great. It’s a bit long to read, and it contains duplication. What if
we decide the letter e should be capitalized in eggs? We’d have to change it in three vari-
ables: egg , brownEggs , and otherEggs .
A better way to deal with this situation is to use two of the default methods on
Predicate :
Predicate<String> brownEggs = egg.and(brown);
Predicate<String> otherEggs = egg.and(brown.negate());
Neat! Now we are reusing the logic in the original Predicate s to build two new ones. It’s
shorter and clearer what the relationship is between the Predicate s. We can also change
the spelling of egg in one place, and the other two objects will have new logic because
they reference it*/
}
