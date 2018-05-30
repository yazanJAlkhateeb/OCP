package C$$GenericsandCollections.B$$UsingListsANDSetsANDMapsandQueues.UsingtheListInterface;

public class LoopingthroughList {
    /*
    * Back on the OCA, you learned how to loop through a list using an enhanced for loop:
for (String string: list) {
System. out .println(string);
}
You’ll see another longer way to do this in code written before Java 5:
Iterator iter = list.iterator();
while(iter.hasNext()) {
String string = (String) iter.next();
System.out.println(string);
}
The old way requires casting because it predates generics. It also requires checking if the
Iterator has any more elements followed by requesting the next element. There’s also
a hybrid way where you still use Iterator with generics. You get rid of the cast but still
have to handle the looping logic yourself.
Iterator<String> iter = list.iterator();
while(iter.hasNext()) {
String string = iter.next();
System.out.println(string);
}
Pay attention to the difference between these methods. hasNext() checks if there is a
next value. In other words, it tells you whether next() will execute without throwing an
exception. next() actually moves the Iterator to the next element.*/
}
