package A$$AdvancedClassDesign.C$$AnnotatingOverriddenMethods;

public class OverrideAnnotationSample {
    class Bobcat {
        public void findDen() {
        }
    }

    class BobcatMother extends Bobcat {
        @Override
        public void findDen() {
        }
    }
}
