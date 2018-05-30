package QuestionAndAnswers.q56;

public class Msg {
 
    public static String doMsg(char x) {
        return "Good Day!";
    }
 
    public static String doMsg(int y) {
        return "Good Luck!";
    }
 
    public static void main(String[] args) {
        char x = 8;
        int z = 'f';
        System.out.println(doMsg(x));
        System.out.print(doMsg(z));
    }
}