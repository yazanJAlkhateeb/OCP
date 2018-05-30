package B$$DesignPatternsandPrinciples.E$$WorkingwithDesignPatterns.A$$ApplyingtheSingletonPattern.CreatesSingletonUsingStaticInitialization;

public class StaffRegister {
    private static final StaffRegister instance;

    static {
        instance = new StaffRegister();
// Perform additional steps
    }

    private StaffRegister() {
    }

    public static StaffRegister getInstance() {
        return instance;
    }
}