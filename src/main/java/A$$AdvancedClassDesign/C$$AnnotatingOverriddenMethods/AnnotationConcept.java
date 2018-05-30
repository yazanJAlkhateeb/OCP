package A$$AdvancedClassDesign.C$$AnnotatingOverriddenMethods;

public class AnnotationConcept {
    /*when you see code that begins with an
@ symbol, it is an annotation. An annotation is extra information about the program, and it
is a type of metadata. It can be used by the compiler or even at runtime.*/

    /*The @Override annotation is used to express that you, the programmer, intend for this
method to override one in a superclass or implement one from an interface. You don’t tradi-
tionally think of implementing an interface as overriding, but it actually is an override. It so
happens that the method being overridden is an abstract one.*/

    /*@Override is allowed only when referencing a method. Just as there is no such thing as
overriding a field, the annotation cannot be used on a field either.*/

    /*you must check carefully that
the method is doing one of three things:
■ ■ Implementing a method from an interface
■ ■ Overriding a superclass method of a class shown in the example
■ ■ Overriding a method declared in Object , such as hashCode , equals , or toString*/
}
