package E$$DatesStringsandLocalization.B$$AddingInternationalizationANDLocalization.Local;

import java.util.Locale;

public class LocalBuilder {
    //There’s another way to create a Locale that is more fl exible. The builder design pattern lets
    // you set all of the properties that you care about and then build it at the end
    public static void main(String[] args) {
        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();
      //  The locale builder converts to uppercase or lowercase for you as needed, which means
      //  this is legal:
        Locale l3 = new Locale.Builder()// bad but legal
                .setRegion("us")
                .setLanguage("EN")
                .build();
       // Please don’t write code that looks like this example. Your teammates will expect US to be
       // in uppercase and en to be in lowercase. Switching it is just confusing.
    }
}
