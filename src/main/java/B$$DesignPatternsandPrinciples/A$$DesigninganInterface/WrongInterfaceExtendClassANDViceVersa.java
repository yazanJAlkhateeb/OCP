package B$$DesignPatternsandPrinciples.A$$DesigninganInterface;

public class WrongInterfaceExtendClassANDViceVersa {
    /*Remember that an interface cannot extend a class, nor can a class extend an interface.
    For these reasons, none of the following definitions using our previous Walk interface and
Lion class will compile:*/
  //  public interface Sleep extends Lion {}// DOES NOT COMPILE

  //  public class Tiger extends Walk {}// DOES NOT COMPILE

    /*In the first definition, the interface Sleep cannot extend Lion, since Lion is a class.
Likewise, the class Tiger cannot extend the interface Walk.*/

}
