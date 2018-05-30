package A$$AdvancedClassDesign.F$$CreatingNestedClasses.C$$AnonymousInnerClasses;

public class AnonymousInnerClassesSample {
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }
    public int admission(int basePrice) {
        return basePrice -new SaleTodayOnly() {int dollarsOff() { return 3; }}.dollarsOff();
    }

}

