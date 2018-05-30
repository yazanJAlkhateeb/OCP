package QuestionAndAnswers.q10;

public class Customer {
    private static int count;

    static  {
        count = 0;
    }

    private String fName;
    private String lName;

    public Customer(String first, String last) {
        fName = first;
        lName = last;
        ++count;
    }

    public static int getCount() {
        return count;
    }
}