package C$$GenericsandCollections.A$$WorkingwithGenerics.InteractingwithLegacyCode;

import java.util.ArrayList;
import java.util.List;

public class WhenSomeCodeUseGenericAndTheOtherNot {
    class Dragon {}
    static class Unicorn { }
    static class LegacyDragons {
        public static void main(String[] args) {
            List unicorns = new ArrayList();
            unicorns.add(new Unicorn());
            printDragons(unicorns);
        }
        private static void printDragons(List<Dragon> dragons) {
            for (Dragon dragon: dragons) {
//you will get  ClassCastException here
                System.out.println(dragon);
            } } }
}
