package E$$DatesStringsandLocalization.B$$AddingInternationalizationANDLocalization.UsingResourceBundle.DeterminingWhichResourceBundletoUse;

import java.util.Locale;
import java.util.ResourceBundle;

public class Concept {
    public static void main(String[] args) {
        //On the exam, there are two methods for getting a resource bundle:
        ResourceBundle.getBundle("name");
        ResourceBundle.getBundle("name", Locale.getDefault());
    }

}
