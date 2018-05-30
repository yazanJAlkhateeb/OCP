package E$$DatesStringsandLocalization.B$$AddingInternationalizationANDLocalization.Local;

import java.util.Locale;

public class ChangeTheDefaultLocal {
    public static void main(String[] args) {
     //   You can set a new default right in Java:
        System.out.println(Locale.getDefault()); // en_US
        Locale locale = new Locale("fr");
        Locale.setDefault(locale);
// change the default
        System.out.println(Locale.getDefault()); // fr
      //  Try it, and don’t worry—the Locale changes only for that one Java program. It does not
      //  change any settings on your computer. It does not even change future programs. If you run
      //  the previous code multiple times, the output will stay the same.
    }
}
