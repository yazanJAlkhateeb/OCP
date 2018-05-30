package A$$AdvancedClassDesign.E$$WorkingwithEnums;

public class UsingEnumsinSwitchStatements
{
    public static void main(String[] args) {

        switch (EnumSample.Season.SUMMER) {
            case WINTER:
                System.out.println("Get out the sled!");
                break;
            case SUMMER:
                System.out.println("Time for the pool!");
                break;
            default:
                System.out.println("Is it summer yet?");
        }
     /*   The following code does not
        compile:*/
        switch (EnumSample.Season.SUMMER) {
         //   case 0:// DOES NOT COMPILE
              //  System.out.println("Get out the sled!");
               // break;
        }
       /* You can’t compare an int with an enum .*/
    }
}
