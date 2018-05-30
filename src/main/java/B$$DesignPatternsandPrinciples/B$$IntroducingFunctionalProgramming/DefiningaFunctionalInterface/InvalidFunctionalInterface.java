package B$$DesignPatternsandPrinciples.B$$IntroducingFunctionalProgramming.DefiningaFunctionalInterface;

import B$$DesignPatternsandPrinciples.B$$IntroducingFunctionalProgramming.DefiningaFunctionalInterface.FunctionalInterfaceSample;

public class InvalidFunctionalInterface {
    public interface Walk {}

    public interface Dance extends FunctionalInterfaceSample {
        public void dance(Integer animal);
    }

    public interface Crawl {
        public void crawl();
        public int getCount();
    }
    //as they have more than one abstract method
    /*In these examples, applying the @FunctionalInterface annotation to any of these
interfaces would result in a compiler error,*/
}
