package C$$GenericsandCollections.A$$WorkingwithGenerics.GenericInterfaces;

import C$$GenericsandCollections.Robot;
import C$$GenericsandCollections.Shippable;

public class ThreeWayToImplementGenericInterface {
    /*--The first is to--
specify the generic type in the class. The following concrete class says that it deals only
with robots. This lets it declare the ship() method with a Robot parameter:*/
    class ShippableRobotCrate implements Shippable<Robot> {
        public void ship(Robot t) {
        }
    }

    /* --The next way is to create a generic class. The following concrete class allows the caller
             to specify the type of the generic:*/
    class ShippableAbstractCrate<T> implements Shippable<T> {
        public void ship(T t) {
        }
    }

    /*
    -- The final way is to not use generics at all. This is the old way of writing code. It gener-
ates a compiler warning about Shippable being a raw type, but it does compile. Here the
ship() method has an Object parameter since the generic type is not defined:*/
    class ShippableCrate implements Shippable {
        public void ship(Object t) {
        }
    }

}
