package E$$DatesStringsandLocalization.B$$AddingInternationalizationANDLocalization.Local;

import java.util.Locale;

public class WaysToCreateLocal {
    //You can also use a Locale other than the default. There are three main ways of creating
    //a Locale .
    public static void main(String[] args) {
       // First, the Locale class provides constants for some of the most commonly used
      //  locales:
        System.out.println(Locale.GERMAN); // de
        System.out.println(Locale.GERMANY); // de_DE

        //The other two main ways of creating a Locale are to use the
       // constructors. You can pass just a language or both a language and country:
        System.out.println(new Locale("fr"));
        System.out.println(new Locale("hi", "IN"));
        /*imp
        * Java will let you create a Locale with an invalid language or country. However, it will
not match the Locale that you want to use and your program will not behave as expected.*/


    }
}
