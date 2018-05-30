package C$$GenericsandCollections.A$$WorkingwithGenerics.GenericMethods;

import C$$GenericsandCollections.Crate;

public class FormalTypeParameterBeforeReturn {
    public static <T> Crate<T> ship(T t) {
        System.out.println("Preparing " + t);
        return new Crate<T>();
    }
        /*The method parameter is the generic type T . The return type is a Crate<T> . Before the
        return type, we declare the formal type parameter of <T> .
                Unless a method is obtaining the generic formal type parameter from the class/interface,
        it is specified immediately before the return type of the method. This can lead to some
        interesting-looking code!
         */

    public static <T> void sink(T t) {
    }

    public static void main(String[] args)
    {

        FormalTypeParameterBeforeReturn.<String>sink("");
    }

    public static <T> T identity(T t) {
        return t;
    }
    //   public static T noGood (T t){ // DOES NOT COMPILE
    //   return t;
}
