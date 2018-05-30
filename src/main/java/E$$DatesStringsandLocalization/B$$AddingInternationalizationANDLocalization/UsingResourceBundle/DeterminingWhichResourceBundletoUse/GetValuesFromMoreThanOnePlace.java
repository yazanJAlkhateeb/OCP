package E$$DatesStringsandLocalization.B$$AddingInternationalizationANDLocalization.UsingResourceBundle.DeterminingWhichResourceBundletoUse;

import java.util.Locale;
import java.util.ResourceBundle;

public class GetValuesFromMoreThanOnePlace {
    //Java isn’t required to get all of
    //the keys from the same resource bundle. It can get them from any parent of the matching
    //resource bundle. A parent resource bundle in the hierarchy just removes components of the
    //name until it gets to the top
    //----------------------------
    public static void main(String[] args) {


        Locale locale = new Locale("en", "CA");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.print(rb.getString("hello"));
        System.out.print(". ");
        System.out.print(rb.getString("name"));
        System.out.print(" ");
        System.out.print(rb.getString("open"));
        System.out.print(" ");
        System.out.print(rb.getString("visitor"));
    }
    //The answer is Hello. Vancouver Zoo is open Canada visitor .

    //Zoo.properties
    //name=Vancouver Zoo
    //
    //Zoo_en.properties
    //hello=Hello
    //open=is open
    //
    //Zoo_en_CA.properties
    //visitor=Canada visitor
    //
    //Zoo_fr.properties
    //hello=Bonjour
    //open=est ouvert
    //Zoo_fr_CA.properties
    //visitor=Canada visiteur
}
