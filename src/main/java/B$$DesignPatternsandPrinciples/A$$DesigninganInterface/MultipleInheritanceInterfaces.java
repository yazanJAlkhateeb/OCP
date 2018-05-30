package B$$DesignPatternsandPrinciples.A$$DesigninganInterface;

public class MultipleInheritanceInterfaces {
   /* Interfaces also serve to provide limited support for multiple inheritance within the
    Java language, as a class may implement multiple interfaces, such as in the following
            example:*/
    public interface Swim {
    }

    public interface Hop {
    }

    public class Frog implements Swim, Hop {
    }
   /* In this example, the Frog class implements both the Swim and Hop interfaces.*/
}
