package E$$DatesStringsandLocalization.B$$AddingInternationalizationANDLocalization.UsingResourceBundle.DeterminingWhichResourceBundletoUse;

public class StepToChooseTheBundle {
    //1 Zoo_fr_FR.java The requested locale
    //2 Zoo_fr_FR.properties The requested locale
    //3 Zoo_fr.java The language we requested with no country
    //4 Zoo_fr.properties The language we
    //requested with no country
    //5 Zoo_en_US.java The default locale
    //6 Zoo_en_US.properties The default locale
    //7 Zoo_en.java The default language with
    //no country
    //8 Zoo_en.properties The default language with
    //no country
    //9 Zoo.java No locale at all—the default bundle
    //10 Zoo.properties No locale at all—the default bundle
    //11 If still not found, throw MissingResourceException .

    //You do need to be able to create the 11-step list in Table 5.7. As another way of remem-
    //bering it, learn these steps:
    //Always look for the property file after the matching Java class.

    //Drop one thing at a time if there are no matches. First drop the country and then the
    //language.

    //Look at the default locale and the default resource bundle last.
}
