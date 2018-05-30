package B$$DesignPatternsandPrinciples.E$$WorkingwithDesignPatterns.A$$ApplyingtheSingletonPattern.FirstSampleOfSingleton;

public class HayStorage {

    private static final HayStorage instance = new HayStorage();
    private int quantity = 0;

    private HayStorage() {
    }

    public static HayStorage getInstance() {
        return instance;
    }

    public synchronized void addHay(int amount) {
        quantity += amount;
    }

    public synchronized boolean removeHay(int amount) {
        if (quantity < amount) return false;
        quantity -= amount;
        return true;
    }

    public synchronized int getHayQuantity() {
        return quantity;
    }
}
/*As shown in the preceding code, singletons in Java are created as private static
variables within the class, often with the name instance. They are accessed via a single
public static method, often named getInstance(), which returns the reference to the
singleton object. Finally, all constructors in a singleton class are marked private, which
ensures that no other class is capable of instantiating another version of the class.*/