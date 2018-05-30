package A$$AdvancedClassDesign.F$$CreatingNestedClasses.D$$StaticNestedClasses;

public class Concep {
    /*A static nested class is a static
class defined at the member level. It can be instantiated without an object of the
enclosing class, so it can’t access the instance variables without an explicit object of
the enclosing class*/

    /*In other words, it is like a regular class except for the following:

The nesting creates a namespace because the enclosing class name must be used to refer
to it.

It can be made private or use one of the other access modifiers to encapsulate it.

The enclosing class can refer to the fields and methods of the static nested class.*/
    public static void main(String[] args) {
        Enclosing.Nested nested=new Enclosing.Nested();
    }
}
