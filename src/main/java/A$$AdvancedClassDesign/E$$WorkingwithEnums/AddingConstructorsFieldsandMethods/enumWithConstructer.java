package A$$AdvancedClassDesign.E$$WorkingwithEnums.AddingConstructorsFieldsandMethods;
/*This is such a subtle detail that we are going to say it again: remember that
the semicolon at the end of the enum values is optional only if the only
thing in the enum is that list of values.*/
public class enumWithConstructer {
    public enum Season {
        WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
        private String expectedVisitors;

        private Season(String expectedVisitors) {
            this.expectedVisitors = expectedVisitors;
        }
        /*The constructor is private because it can only be called from within the enum .
        The code will not compile with a public constructor.*/

        public void printExpectedVisitors() {
            System.out.println(expectedVisitors);
        }
    }

    public static void main(String[] args) {
        Season.SPRING.printExpectedVisitors();
    }
}
