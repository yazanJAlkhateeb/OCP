package C$$GenericsandCollections.A$$WorkingwithGenerics.GenericClasses;

public class TypeErasureProcess {
    /*Behind the scenes, the compiler replaces all references to T in Crate with Object . In other
words, after the code compiles, your generics are actually just Object types. The Crate
class looks like the following:
*/
    class Crate {
        private Object contents;

        public Object emptyCrate() {
            return contents;
        }

        public void packCrate(Object contents) {
            this.contents = contents;
        }
    }/*

This means there is only one class file. There aren’t different copies for different
parameterized types. (Some other languages work that way.)
This process of removing the generics syntax from your code is referred to as type
erasure. Type erasure allows your code to be compatible with older versions of Java
that do not contain generics.
The compiler adds the relevant casts for your code to work with this type of erased
class. For example, you type

Robot r = crate.emptyCrate();
and the compiler turns it into
Robot r = (Robot) crate.emptyCrate();*/
}
