package B$$DesignPatternsandPrinciples.B$$IntroducingFunctionalProgramming.DefiningaFunctionalInterface.ImplementingFunctionalInterfaceswithLambdas;

import java.util.function.Consumer;

public class UnderstandingLambdaSyntax {

    /*The syntax of lambda expressions is tricky because many parts are optional. These two
lines are equivalent and do the exact same thing:
a -> a.canHop()

(Animal a) -> { return a.canHop(); }*/
    /*The fi rst example, shown in Figure 2.1 , has three parts:
■ We specify a single parameter with the name a .
■ The arrow operator → separates the parameter from the body.
■ The body calls a single method and returns the result of that method.*/

    /*The second example also has three parts, as shown in Figure 2.2; it’s just more verbose:

We specify a single parameter with the name a and state that the type is Animal,
wrapping the input parameters in parentheses ().

The arrow operator −> separates the parameter from the body.

The body has one or more lines of code, including braces {}, a semicolon ;, and a
return statement.*/
  /*
() -> true;
a -> {return a.startsWith("test");}
(String a) -> a.startsWith("test");
(int x) -> {};
(int y) -> {return;};(a, b) -> a.startsWith("test")
(String a, String b) -> a.startsWith("test")

 */
 }
