package E$$DatesStringsandLocalization.B$$AddingInternationalizationANDLocalization.FormattingNumbers;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormat {
    public static void main(String[] args) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println(currencyInstance.format(48));

        /*In the real world, use int or BigDecimal for money and not double . Doing
math on amounts with double is dangerous, and your boss won’t appreci-
ate it if you lose pennies during transactions.*/
    }
}
