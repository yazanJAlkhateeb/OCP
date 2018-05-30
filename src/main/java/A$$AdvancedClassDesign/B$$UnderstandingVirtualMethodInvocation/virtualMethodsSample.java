package A$$AdvancedClassDesign.B$$UnderstandingVirtualMethodInvocation;

public class virtualMethodsSample {
    class Cow extends Animal2 {
        public void feed() {
            addHay();
        }

        private void addHay() {
        }
    }

    class Bird extends Animal2 {
        public void feed() {
            addSeed();
        }

        private void addSeed() {
        }
    }

    class Lion extends Animal2 {
        public void feed() {
            addMeat();
        }

        private void addMeat() {
        }
    }
}
