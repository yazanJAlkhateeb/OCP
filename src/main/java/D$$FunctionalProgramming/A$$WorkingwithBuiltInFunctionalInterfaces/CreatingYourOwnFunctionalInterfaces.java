package D$$FunctionalProgramming.A$$WorkingwithBuiltInFunctionalInterfaces;

public class CreatingYourOwnFunctionalInterfaces {
    /*
    * Java provides a built-in interface for functions with one or two parameters. What if you need
more? No problem. Suppose that you want to create a functional interface for the wheel
speed of each wheel on a tricycle. You could create a functional interface such as this:*/
interface TriFunction<T,U,V,R> {
R apply(T t, U u, V v);
}
/*There are four type parameters. The first three supply the types of the three wheel
speeds. The fourth is the return type. Now suppose that you want to create a function to
determine how fast your quad-copter is going given the power of the four motors. You
could create a functional interface such as the following:*/
interface QuadFunction<T,U,V,W,R> {
R apply(T t, U u, V v, W w);
}
}
