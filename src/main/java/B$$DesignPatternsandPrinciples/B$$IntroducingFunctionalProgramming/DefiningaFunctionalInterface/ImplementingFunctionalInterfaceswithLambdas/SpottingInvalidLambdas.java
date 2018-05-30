package B$$DesignPatternsandPrinciples.B$$IntroducingFunctionalProgramming.DefiningaFunctionalInterface.ImplementingFunctionalInterfaceswithLambdas;

public class SpottingInvalidLambdas {

    /*Can you figure out why each of the following lambda expressions is invalid and will not
    compile when used as an argument to a method?/*
    Duck d -> d.quack()// DOES NOT COMPILE
    a,d -> d.quack()// DOES NOT COMPILE
    Animal a, Duck d -> d.quack()// DOES NOT COMPILE

    a, b -> a.startsWith("test")// DOES NOT COMPILE
c -> return 10;// DOES NOT COMPILE
a -> { return a.startsWith("test") }// DOES NOT COMPILE


/*As mentioned, the data types for the input parameters of a lambda expression are
optional. When one parameter has a data type listed, though, all parameters must provide
a data type. The following lambda expressions are each invalid for this reason:
(int y, z) -> {int x=1; return y+10; }// DOES NOT COMPILE
(String s, z) -> { return s.length()+z; }// DOES NOT COMPILE
(a, Animal b, c) -> a.getName()// DOES NOT COMPILE

    There is one more issue you might see with lambdas. We’ve been defining an argument
    list in our lambda expressions. Since Java doesn’t allow us to re‐declare a local variable, the
    following is an issue:
            (a, b) -> { int a = 0; return 5;}// DOES NOT COMPILE

*/
}
