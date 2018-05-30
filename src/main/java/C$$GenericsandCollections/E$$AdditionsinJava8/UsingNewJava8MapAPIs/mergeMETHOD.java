package C$$GenericsandCollections.E$$AdditionsinJava8.UsingNewJava8MapAPIs;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class mergeMETHOD {
    /*The merge() method allows adding logic to the problem of what to choose. Suppose that
our guests are indecisive and can’t pick a favorite. They agree that the ride that has the lon-
gest name must be the most fun. We can write code to express this by passing a mapping
function to the merge() method:*/
    public static void main(String[] args) {
        BiFunction<String, String, String> mapper = (v1, v2)
                -> v1.length() > v2.length() ? v1 : v2;
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");
        String jenny = favorites.merge("Jenny", "Skyride", mapper);
        String tom = favorites.merge("Tom", "Skyride", mapper);
        System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}
        System.out.println(jenny);
// Bus Tour
        System.out.println(tom);
// Skyride

        /*and it sees that “Bus Tour”
is longer than “Skyride,” so it leaves the value as “Bus Tour.” Line 19 calls this mapping
function again. This time “Tram” is not longer than “Skyride,” so the map is updated*/
        /*The merge() method also has logic for what happens if null s or missing keys are
involved. In this case, it doesn’t call the BiFunction at all, and it simply uses the new
value*/
    }
}
