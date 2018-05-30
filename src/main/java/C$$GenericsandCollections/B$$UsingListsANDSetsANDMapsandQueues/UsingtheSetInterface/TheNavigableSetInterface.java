package C$$GenericsandCollections.B$$UsingListsANDSetsANDMapsandQueues.UsingtheSetInterface;

public class TheNavigableSetInterface {
/*TreeSet implements the NavigableSet interface. This interface provides some interest-
ing methods. Their method signatures are as follows:
Method                  Description
E lower(E e)             Returns greatest element that is < e, or null if no such element
E floor(E e)            Returns greatest element that is <= e, or null if no such element
E ceiling(E e)              Returns smallest element that is >= e, or null if no such element
E higher(E e)               Returns smallest element that is > e, or null if no such element
These methods were added to the exam with Java 6, so you might come across them.
Let’s look at an example of these methods:
36: NavigableSet<Integer> set = new TreeSet<>();
37: for (int i = 1; i <= 20; i++) set.add(i);
38: System.out.println(set.lower(10)); // 9
39: System.out.println(set.floor(10)); // 10
40: System.out.println(set.ceiling(20)); // 20
41: System.out.println(set.higher(20)); // null
The TreeSet contains 20 Integer objects whose values are 1 to 20 . In this example, line
38 must return the highest element that is less than 10 . Line 39 must return the highest
element that is no higher than 10 . See the difference? One includes the target element
and the other does not.
Line 40 must return the lowest element greater than or equal to 20 . Line 41 must return
the lowest element greater than 20 . There is no such element that meets these criteria,
making the result null .
These methods sound similar. Just remember that lower and higher elements do not
include the target element. This also makes sense in English. If something needs to be
lower than a coffee table, it must completely fit under the coffee table.*/
}
