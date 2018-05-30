package C$$GenericsandCollections.E$$AdditionsinJava8.UsingNewJava8MapAPIs;

import java.util.HashMap;
import java.util.Map;

public class putIfAbsentMETHOD {
    public static void main(String[] args) {
       /* you can call if you want to set a
        value in the map, but this method skips it if the value is already set to a non- null value:*/
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);
        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tram");
        favorites.putIfAbsent("Tom", "Tram");
        System.out.println(favorites); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
    }
}
