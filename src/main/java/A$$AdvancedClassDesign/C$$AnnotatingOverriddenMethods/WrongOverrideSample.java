package A$$AdvancedClassDesign.C$$AnnotatingOverriddenMethods;

public class WrongOverrideSample {
    class Bobcat {
        public void findDen() { }
    }
    class BobcatMother extends Bobcat {
        //@Override
        public void findDen(boolean b) { } // DOES NOT COMPILE
    }
}
