package A$$AdvancedClassDesign.A$$ReviewingOCAConcepts;

public class OverloadingandOverriding {
    /*When multiple overloaded methods are present, Java looks for the closest match first
It tries to find the following:
■ ■ Exact match by type
■ ■ Matching a superclass type
■ ■ Converting to a larger primitive type
■ ■ Converting to an autoboxed type
■ ■ Varargs*/
    /*For overriding, the overridden method has a few rules:
The access modifier must be the same or more accessible.

The return type must be the same or a more restrictive type, also known as covariant
return types.

If any checked exceptions are thrown, only the same exceptions or subclasses of those
exceptions are allowed to be thrown.*/

    /*The methods must not be static . (If they are, the method is hidden and not
overridden.)*/

    class Bobcat {
        public void findDen() throws Exception {
        }
    }

    public class BobcatKitten extends Bobcat {
        public void findDen() throws RuntimeException {
        }

        public void findDen(boolean b) {
        }

        public int findden() throws Exception {
            return 0;
        }
    }
}
