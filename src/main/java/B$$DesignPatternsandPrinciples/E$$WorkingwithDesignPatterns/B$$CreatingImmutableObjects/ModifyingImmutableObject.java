package B$$DesignPatternsandPrinciples.E$$WorkingwithDesignPatterns.B$$CreatingImmutableObjects;

public class ModifyingImmutableObject {
    /*How do we modify immutable objects if they are inherently unmodifiable? The answer is,
we can’t! Alternatively, we can create new immutable objects that contain all of the same
information as the original object plus whatever we wanted to change. This happens every
time we combine two strings:
String firstName = "Grace";
String fullName = firstName + " Hopper";
In this example, the firstName is immutable and is not modified when added to the
fullName, which is also an immutable object. We can also do the same thing with our
Animal class. Imagine that we want to increase the age of an Animal by one. The following
creates two Animal instances, the second using a copy of the data from the first instance:
// Create a new Animal instance
Animal lion = new Animal("lion", 5, Arrays.asList("meat","more meat"));

// Create a new Animal instance using data from the first instance
List<String> favoriteFoods = new ArrayList<String>();
for(int i=0; i<lion.getFavoriteFoodsCount(); i++) {
favoriteFoods.add(lion.getFavoriteFood(i));
}
Animal updatedLion = new Animal(lion.getSpecies(), lion.getAge()+1,
favoriteFoods);
Since we did not have direct access to the favoriteFoods mutable List, we had to
copy it using the methods available in the immutable class. We could also simplify this by
defining a method in Animal that returns a copy of the favoriteFood List, provided that86

the caller understands that modifying this copied List does not change the original Animal
object in any way.*/
}
