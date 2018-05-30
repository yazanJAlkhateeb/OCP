package E$$DatesStringsandLocalization.B$$AddingInternationalizationANDLocalization.FormattingNumbers;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExtraCharactersWhenParsing {
    public static void main(String[] args) throws ParseException {
   /* The parse method parses only the beginning of a string. After it reaches a character that
    cannot be parsed, the parsing stops and the value is returned. Do you see why each of
    these behaves as it does?*/
        NumberFormat nf = NumberFormat.getInstance();
        String one = "456abc";
        String two = "-2.5165x10";
        String three = "x85.3";
        System.out.println(nf.parse(one)); // 456
        System.out.println(nf.parse(two)); // -2.5165
        System.out.println(nf.parse(three));// throws ParseException
       /* The first two lines parse correctly.There happen to be extra characters after the number,
                but that’s OK.The third parsing fails because there are no numbers at the beginning of
        the String .Java instead throws a java.text.ParseException.*/
    }
}
