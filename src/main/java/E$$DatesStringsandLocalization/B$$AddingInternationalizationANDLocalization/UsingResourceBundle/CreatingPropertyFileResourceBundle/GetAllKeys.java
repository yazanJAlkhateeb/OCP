package E$$DatesStringsandLocalization.B$$AddingInternationalizationANDLocalization.UsingResourceBundle.CreatingPropertyFileResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class GetAllKeys {
    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);

        Set<String> keys = rb.keySet();
        keys.stream().map(k -> k + " " + rb.getString(k))
                .forEach(System.out::println);
    }
}
