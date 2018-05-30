package C$$GenericsandCollections.E$$AdditionsinJava8.UsingNewJava8MapAPIs;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class computeIfPresentandcomputeIfAbsent {
    /*computeIfPresent() calls the BiFunction if the requested key is found*/
    public static void main(String[] args) {
        Map<String, Integer> counts = new HashMap<>();
        counts.put("Jenny", 1);
        BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
        Integer jenny = counts.computeIfPresent("Jenny", mapper);
        Integer sam = counts.computeIfPresent("Sam", mapper);
        System.out.println(counts); // {Jenny=2}
        System.out.println(jenny); // 2
        System.out.println(sam); // null

        /*For computeIfAbsent() , the functional interface runs only when the key isn’t present or
is null its using function interface*/

        Map<String, Integer> counts1 = new HashMap<>();
        counts1.put("Jenny", 15);
        counts1.put("Tom", null);
        Function<String, Integer> mapper1 = (k) -> 1;
        Integer jenny1 = counts.computeIfAbsent("Jenny", mapper1); // 15
        Integer sam1 = counts.computeIfAbsent("Sam", mapper1); // 1
        Integer tom1 = counts.computeIfAbsent("Tom", mapper1); // 1
        System.out.println(counts1); // {Tom=1, Jenny=15, Sam=1}
    }

}
