package B$$DesignPatternsandPrinciples.C$$ImplementingPolymorphism;

public class PolySample {
    public interface LivesInOcean { public void makeSound(); }

    public static class Dolphin implements LivesInOcean {
        public void makeSound() { System.out.println("whistle"); }
    }

    public static class Whale implements LivesInOcean {
        public void makeSound() { System.out.println("sing"); }
    }

    public static class Oceanographer {
        public void checkSound(LivesInOcean animal) {
            animal.makeSound();
        }
        public static void main(String[] args) {
            Oceanographer o = new Oceanographer();
            o.checkSound(new Dolphin());
            o.checkSound(new Whale());
        }
    }
}
