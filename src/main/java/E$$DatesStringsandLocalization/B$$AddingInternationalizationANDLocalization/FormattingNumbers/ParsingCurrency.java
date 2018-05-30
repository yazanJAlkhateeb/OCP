package E$$DatesStringsandLocalization.B$$AddingInternationalizationANDLocalization.FormattingNumbers;

import java.text.NumberFormat;
import java.text.ParseException;

public class ParsingCurrency {
    public static void main(String[] args) throws ParseException {
        String amt = "$92,807.99";
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        Number parse = cf.parse(amt);
        System.out.println(parse); // 92807.99
    }
}
