package A$$AdvancedClassDesign.D$$CodingequalsAnDhashCodeAnDtoString.hashCode;

public class JavaContractFORhashCode {
    /* as the following:
Within the same program, the result of hashCode() must not change. This means that
you shouldn’t include variables that change in figuring out the hash code. In our hippo
example, including the name is fine. Including the weight is not because hippos change
weight regularly.

If equals() returns true when called with two objects, calling hashCode() on each of
those objects must return the same result. This means hashCode() can use a subset of
the variables that equals() uses. You saw this in the card example. We used only one
of the variables to determine the hash code.

If equals() returns false when called with two objects, calling hashCode() on each of
those objects does not have to return a different result. This means hashCode() results
do not need to be unique when called on unequal objects.*/
}
