package F$$ExceptionsAndAssertions.B$$CreatingCustomExceptions;

public class Concept {
    /*it is most common to
extend Exception (for checked) or RuntimeException (for unchecked.)*/

    /*examples*/

    class CannotSwimException extends Exception {}
    class DangerInTheWater extends RuntimeException {}
    class SharkInTheWaterException extends DangerInTheWater {}
    class Dolphin {
        public void swim() throws CannotSwimException {
// logic here
        }
    }
}
