package E$$DatesStringsandLocalization.B$$AddingInternationalizationANDLocalization.UsingResourceBundle.CreatingJavaClassResourceBundle;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Tax_en_US extends ListResourceBundle {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle(
                "Zoo", Locale.US);
        System.out.println(rb.getObject("tax"));
    }

    protected Object[][] getContents() {
        return new Object[][]{{"tax", new UsTaxCode()}};
    }
}