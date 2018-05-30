package A$$AdvancedClassDesign.F$$CreatingNestedClasses.C$$AnonymousInnerClasses;

import javax.swing.*;

public class AnonymousInnerClassesArgsSample {
    public int pay() {
        return admission(5, new SaleTodayOnly() {
            @Override
            public int dollarsOff() {
                return 3;
            }
        });
    }

    public int admission(int basePrice, SaleTodayOnly sale) {

        return basePrice - sale.dollarsOff();
    }

    interface SaleTodayOnly {
        int dollarsOff();
    }
}
