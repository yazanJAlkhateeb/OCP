package F$$ExceptionsAndAssertions.F$$WorkingwithAssertions;
/*TestSeasons class contains a switch statement that switches on a
Seasons object. Because there are only three possible outcomes, the default case statement
on lines 11–12 should never execute:*/
public class TestSeasons {
    public static void test(Seasons s) {
        switch (s) {
            case SPRING:
            case FALL:
                System.out.println("Shorter hours");
                break;
            case SUMMER:
                System.out.println("Longer hours");
                break;
            default:
                assert false : "Invalid season";
        }

        /*if somebody call
public static void main(String [] args) {
test (Seasons.WINTER);
}
        * */
        /*Exception in thread "main" java.lang.AssertionError: Invalid season
at TestSeason.main(Test.java:12)
at TestSeason.main(Test.java:18)*/
    }
}