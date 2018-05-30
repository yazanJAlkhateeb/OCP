package A$$AdvancedClassDesign.E$$WorkingwithEnums;

public class Concept {
    /*an enum is a class that represents an
enumeration. It is much better than a bunch of constants because it provides type‐safe
checking. With numeric constants, you can pass an invalid value and not find out until
runtime. With enum s, it is impossible to create an invalid enum type without introducing a
compiler error.*/
    /*To create an enum , use the enum keyword instead of the class keyword*/


    /*Since an enum is like a set of constants, use the uppercase letter convention that you used
for constants.*/

    /*Behind the scenes, an enum is a type of class that mainly contains static members. It
also includes some helper methods like name() that you will see shortly*/
/*You can’t compare an int and enum value directly anyway. Remember that an enum is a
type and not an int .
if ( Season.SUMMER == 2) {} // DOES NOT COMPILE*/

/*Another thing that you can’t do is extend an enum .
public enum ExtendedSeason extends Season { } // DOES NOT COMPILE
The values in an enum are all that are allowed. You cannot add more at runtime by
extending the enum .*/

}
