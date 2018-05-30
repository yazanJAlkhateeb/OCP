package B$$DesignPatternsandPrinciples.A$$DesigninganInterface;

public class InterfaceWithClassImplSample {
    interface Fly {
        public static final int MAX_SPEED = 100;

        public static double calculateSpeed(float distance, double time) {
            return distance / time;
        }

        public int getWingSpan() throws Exception;

        public default void land() {
            System.out.println("Animal is landing");
        }
    }

    public class Eagle implements Fly {


        @Override
        public int getWingSpan()  {
            return 15;
        }

        public void land() {
            System.out.println("Eagle is diving fast");
        }
    }
}
