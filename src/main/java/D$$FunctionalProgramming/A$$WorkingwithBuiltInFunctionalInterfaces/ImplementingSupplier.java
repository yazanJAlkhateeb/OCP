package D$$FunctionalProgramming.A$$WorkingwithBuiltInFunctionalInterfaces;

import java.time.LocalDate;
import java.util.function.Supplier;

public class ImplementingSupplier {
    //A Supplier is used when you want to generate or supply values without taking any input.
    //The Supplier interface is defi ned as
    //@FunctionalInterface public class Supplier<T> {
    //public T get();
    //}
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now; //static method
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();
        Supplier<StringBuilder> s11 = StringBuilder::new; //constructor
        Supplier<StringBuilder> s23 = () -> new StringBuilder();
    }
}
