package A$$AdvancedClassDesign.D$$CodingequalsAnDhashCodeAnDtoString.equals;

public class TheContractforequalsMethods {
    /*Since equals() is such a key method, Java provides a number of rules in the contract for
the method. The exam expects you to recognize correct and incorrect equals() methods,
but it will not ask you to name which property is broken. That said, it is helpful to have
seen it at least once.
The equals() method implements an equivalence relation on non‐null object references:

It is reflexive: For any non‐null reference value x , x.equals(x) should return true .

It is symmetric: For any non‐null reference values x and y , x.equals(y) should return
true if and only if y.equals(x) returns true .

It is transitive: For any non‐null reference values x , y , and z , if x.equals(y) returns
true and y.equals(z) returns true , then x.equals(z) should return true .

It is consistent: For any non‐null reference values x and y , multiple invocations of
x.equals(y) consistently return true or consistently return false , provided no
information used in equals comparisons on the objects is modified.

For any non‐null reference value x , x.equals(null) should return false .*/

    /*The most interesting rule is the last
one. It should be obvious that an object and null aren’t equal. The key is that equals()
needs to return false when this occurs rather than throw a NullPointerException .*/
}
