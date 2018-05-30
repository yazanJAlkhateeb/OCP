package D$$FunctionalProgramming.A$$WorkingwithBuiltInFunctionalInterfaces;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class ImplementingUnaryOperatorANDBinaryOperator {
//UnaryOperator and BinaryOperator are a special case of a function. They require all type
//parameters to be the same type
    //@FunctionalInterface public
    //extends Function<T, T> {
    //@FunctionalInterface public
    //extends BiFunction<T, T,
    //class UnaryOperator<T>
    //}
    //class BinaryOperator<T>
    //T> { }
public static void main(String[] args) {
    System.out.println("yaz/an".replaceAll("[</>]"," "));

//    UnaryOperator<String> u1 = String::toUpperCase;
//    UnaryOperator<String> u2 = x -> x.toUpperCase();
//    System.out.println(u1.apply("chirp"));
//    System.out.println(u2.apply("chirp"));
//
//    BinaryOperator<String> b1 = String::concat;
//    BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
//    System.out.println(b1.apply("baby ", "chick")); // baby chick
//    System.out.println(b2.apply("baby ", "chick")); // baby chick


}
}
