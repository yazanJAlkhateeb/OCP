package B$$DesignPatternsandPrinciples.E$$WorkingwithDesignPatterns.C$$UsingtheBuilderPattern;

public class Concept {
    /*Problem How do we create an object that requires numerous values to be set at the time
the object is instantiated?*/
 /*   Solution    The builder pattern is a creational pattern in which parameters are passed to a
    builder object, often through method chaining, and an object is generated with a final build
    call. It is often used with immutable objects, since immutable objects do not have setter
    methods and must be created with all of their parameters set, although it can be used with
    mutable objects as well.*/


    /*introducing anti‐Patterns
The problem of a constructor growing too large actually has a name, referred to as the
telescoping constructor anti‐pattern. An anti‐pattern is a common solution to a reoccur-
ring problem that tends to lead to unmanageable or diffi cult‐to‐use code. Anti‐patterns
often appear in complex systems as time goes on, when developers implement a series
of successive changes without considering the long‐term effects of their actions.
For example, with the telescoping constructor anti‐pattern, the class may start off with
only two parameters in the constructor. Another developer may come in and addedWorking with Design Patterns
87
another parameter, thinking “It’s only one more!” A third developer may update the class
and add a fourth parameter, and so on, until the class has 50 or 60 parameters in the
constructor and is in desperate need of rewriting, also called refactoring.
The reason why this is an anti‐pattern is that each time the class is modified, the
developer is only doing minor damage to the class. However, it eventually grows out
of control. If the class is used in a number of important places throughout the system,
refactoring it may become difficult—in some cases nearly impossible. Design patterns
are often written to help prevent anti‐patterns from forming.*/
}
