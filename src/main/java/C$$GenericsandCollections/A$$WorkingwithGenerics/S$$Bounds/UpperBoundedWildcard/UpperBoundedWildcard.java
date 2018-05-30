package C$$GenericsandCollections.A$$WorkingwithGenerics.S$$Bounds.UpperBoundedWildcard;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcard {
    //ArrayList<Number> list = new ArrayList<Integer>(); // DOES NOT COMPILE
    /*it Could Be Like This*/
    List<? extends Number> list = new ArrayList<>();
    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number: list)
            count += number.longValue();
        return count;
    }
    /*
    */interface Flyer { void fly(); }
class HangGlider implements Flyer { public void fly() {} }
class Goose implements Flyer { public void fly() {} }/*
We also have two methods that use it. One just lists the interface and the other uses an
upper bound:*/
private void anyFlyer(List<Flyer> flyer) {}
private void groupOfFlyers(List<? extends Flyer> flyer) {}
/*
Note that we used the keyword extends rather than implements . Upper bounds are like
anonymous classes in that they use extends regardless of whether we are working with a
class or an interface.*/
}
