package E$$DatesStringsandLocalization.B$$AddingInternationalizationANDLocalization.Local;

import java.util.Locale;

public class PickingLocale {
    public static void main(String[] args) {
    //get the default local
    Locale locale = Locale.getDefault();
System.out.println(locale);
/*As practice, make sure that you understand why each of these Locale s is invalid:
US  can have a language without a country, but not the reverse
enUS  missing underscore
US_en  the country and language are reversed
EN   language must be lowercase

The corrected versions are en and en_US .*/
}}
