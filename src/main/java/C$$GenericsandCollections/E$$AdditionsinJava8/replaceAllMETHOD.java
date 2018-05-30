package C$$GenericsandCollections.E$$AdditionsinJava8;

import java.util.Arrays;
import java.util.List;

public class replaceAllMETHOD {
    /*Another new method introduced on List s is replaceAll . Java 8 lets you pass a lambda
expression and have it applied to each element in the list. The result replaces the current
value of that element.
The method signature looks like:
void replaceAll(UnaryOperator<E> o)*/

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.replaceAll(x -> x*2);
        System.out.println(list); // [2, 4, 6]
    }
}
