package D$$FunctionalProgramming.A$$WorkingwithBuiltInFunctionalInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ImplementingConsumerANDBiConsumer {
    //You use a Consumer when you want to do something with a parameter but not return any-
    //thing
    /*
    * @FunctionalInterface public class Consumer<T> {
void accept(T t);
}
@FunctionalInterface public class BiConsumer<T, U> {
void accept(T t, U u);
}*/
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);
        c1.accept("Annie");
        c2.accept("Annie");

        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", 7);
        b2.accept("chick", 1);

        System.out.println(map);
    }
}
