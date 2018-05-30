package C$$GenericsandCollections.A$$WorkingwithGenerics.GenericClasses;

public class TwoGenericParametersClass {
    class SizeLimitedCrate<T, U> {
        private T contents;
        private U sizeLimit;

        public SizeLimitedCrate(T contents, U sizeLimit) {
            this.contents = contents;
            this.sizeLimit = sizeLimit;
        }
    }
}
