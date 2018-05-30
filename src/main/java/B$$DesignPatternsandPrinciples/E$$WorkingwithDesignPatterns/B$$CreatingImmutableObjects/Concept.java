package B$$DesignPatternsandPrinciples.E$$WorkingwithDesignPatterns.B$$CreatingImmutableObjects;

public class Concept{
    /*Problem How do we create read‐only objects that can be shared and used by multiple classes?


Motivation Sometimes we want to create simple objects that can be shared across multiple
classes, but for security reasons we don’t want their value to be modifi ed. We could copy the
object before sending it to another method, but this creates a large overhead that duplicates
the object every time it is passed. Furthermore, if we have multiple threads accessing the same
object, we could run into concurrency issues, as you will see in Chapter 7 .


Solution The immutable object pattern is a creational pattern based on the idea of
creating objects whose state does not change after they are created and can be easily shared
across multiple classes. Immutable objects go hand and hand with encapsulation, except
that no setter methods exist that modify the object. Since the state of an immutable object
never changes, they are inherently thread‐safe.*/

/*Applying an Immutable Strategy Although there are a variety of techniques for writing an immutable class, you should be
familiar with a common strategy for making a class immutable for the exam:
1.Use a constructor to set all properties of the object.
2. Mark all of the instance variables private and final .
3. Don’t define any setter methods.
4. Don’t allow referenced mutable objects to be modified or accessed directly.
5. Prevent methods from being overridden.*/
}
