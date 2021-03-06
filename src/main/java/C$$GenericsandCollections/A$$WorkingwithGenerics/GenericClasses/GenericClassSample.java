package C$$GenericsandCollections.A$$WorkingwithGenerics.GenericClasses;

public class GenericClassSample {
    /*You can introduce generics into your own classes. The syntax for introducing a generic is to
declare a formal type parameter in angle brackets. For example, the following class named
Crate has a generic type variable*/

    class Crate<T> {
        private T contents;

        public T emptyCrate() {
            return contents;
        }

        public void packCrate(T contents) {
            this.contents = contents;
        }
    }
}
