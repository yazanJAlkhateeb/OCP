package D$$FunctionalProgramming.A$$WorkingwithBuiltInFunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ImplementingFunctionANDBiFunction {
    //A Function is responsible for turning one parameter into a value of a potentially different
    //type and returning it
/*@FunctionalInterface public class Function<T, R> {
R apply(T t);
}
@FunctionalInterface public class BiFunction<T, U, R> {
R apply(T t, U u);
}*/
public static void main(String[] args){
    Function<String, Integer> f1 = String::length;
    Function<String, Integer> f2 = x -> x.length();
System.out.println(f1.apply("cluck")); // 5
System.out.println(f2.apply("cluck")); // 5

    BiFunction<String, String, String> b1 = String::concat;
    BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
    System.out.println(b1.apply("baby ", "chick")); // baby chick
    System.out.println(b2.apply("baby ", "chick")); // baby chick
}}
