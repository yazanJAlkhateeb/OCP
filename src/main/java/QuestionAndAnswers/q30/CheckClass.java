package QuestionAndAnswers.q30;

import java.util.Arrays;

class CheckClass {
    public static int checkValue(String s1, String s2) {
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        String[] strArray = new String [] {"Tiger", "Rat", "Cat", "Lion"};
//line n1
        Arrays.sort(strArray, CheckClass::checkValue);
        for (String s : strArray) {
            System.out.print (s + " ");
        }
    }
    /*A.
Arrays.sort(strArray, CheckClass : : checkValue); ///answer

B.
Arrays.sort(strArray, (CheckClass : : new) : : checkValue);

C.
Arrays.sort(strArray, (CheckClass : : new).checkValue);

D.
Arrays.sort(strArray, CheckClass : : new : : checkValue);

*/
}