package D$$FunctionalProgramming.C$$WorkingwithPrimitives.LearningFunctionalInterfacesPrimitives;

import java.util.function.BooleanSupplier;

public class booleanFunctionalInterfaces {
    public static void main(String[] args) {
      //  BooleanSupplier is a separate type. It has one method to implement:
        //boolean getAsBoolean()
        //It works just as you’ve come to expect from functional interfaces, for example:
        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random() > .5;
        boolean asBoolean = b1.getAsBoolean();
        System.out.println(b2.getAsBoolean());
    }
}
