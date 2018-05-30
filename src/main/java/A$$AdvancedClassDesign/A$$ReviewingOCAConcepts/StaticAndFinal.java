package A$$AdvancedClassDesign.A$$ReviewingOCAConcepts;

public class StaticAndFinal {
    /*final prevents a variable from changing or a method from being overridden.
    static makes a variable shared at the class level and uses the class name to refer to a
    method.*/
/*
    static and final are allowed to be added on the class level too. You will see static
    classes in the section on nested classes at the end of this chapter, so don’t worry if you didn’t
    pick up on those. Using final on a class means that it cannot be subclassed. As with meth-
    ods, a class cannot be both abstract and final . In the Java core classes, String is final .*/
    abstract class Cat {
        String name = "The Cat";


        void clean() {
        }
    }

    class Lion extends Cat {
        void clean() {
        }
    }

}
