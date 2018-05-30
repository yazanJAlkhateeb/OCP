package A$$AdvancedClassDesign.D$$CodingequalsAnDhashCodeAnDtoString.hashCode;

public class TheEasyWaytoWritehashCodeMethods {
    /*You probably thought that this was going to be about the Apache Commons Lang class
for hash code. There is one, but it isn’t the easiest way to write hash code.20

It is easier to code your own. Just pick the key fields that identify your object (and
don’t change during the program) and combine them:
public int hashCode() {
return keyField + 7 * otherKeyField.hashCode();
}
It is common to multiply by a prime number when combining multiple fields in the
hash code. This makes the hash code more unique, which helps when distributing
objects into buckets*/
}
