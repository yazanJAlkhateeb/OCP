package A$$AdvancedClassDesign.A$$ReviewingOCAConcepts;

public class Usinginstanceof {
    /*In a instanceof B , the expression returns true if the reference to which a points is an
instance of class B , a subclass of B (directly or indirectly), or a class that implements the B
interface (directly or indirectly).*/
    class HeavyAnimal { }
    class Hippo extends HeavyAnimal { }
    class Elephant extends HeavyAnimal { }
    HeavyAnimal hippo = new Hippo();
    boolean b1 = hippo instanceof Hippo; //true
    boolean b2 = hippo instanceof HeavyAnimal;//true
    boolean b3 = hippo instanceof Elephant;//false
/*The compiler knows an interface could be added, so the instanceof statement could be
true for some subclasses, whereas there is no possible way to turn a Hippo into an Elephant .*/
    /*All Java classes inherit from Object , which means that x instanceof Object is usually
true , except for one case where it is false . If the literal null or a variable reference pointing
to null*/
    HeavyAnimal hippo2 = new Hippo();
    boolean b4 = hippo2 instanceof Object;
    Hippo nullHippo = null;
        boolean b5 = nullHippo instanceof Object;

    Hippo anotherHippo = new Hippo();
  //  boolean bg5 = anotherHippo instanceof Elephant; // DOES NOT COMPILE
   /* Line 31 is a tricky one. The compiler knows that there is no possible way for a Hippo
    variable reference to be an Elephant , since Hippo doesn’t extend Elephant directly or
    indirectly*/
  public interface  Mother {}


    HeavyAnimal hippoInterface = new Hippo();
    boolean b6 = hippo instanceof Mother;
}
