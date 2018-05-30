package QuestionAndAnswers.q17;

import java.util.Locale;

public class q17 {
    // Which two code blocks correctly initialize a Locale variable?
    public static void main(String[] args) {


        //   Locale loc1 = "UK";
        //  Locale loc2 = Locale.getInstance("ru");
        //  Locale loc3 = Locale.getLocaleFactory("RU");
        Locale loc4 = Locale.UK;///answer
        Locale loc5 = new Locale("ru", "RU");///answer
    }
}
