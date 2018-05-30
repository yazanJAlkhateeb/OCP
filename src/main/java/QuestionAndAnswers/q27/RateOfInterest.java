package QuestionAndAnswers.q27;

//Given:
public class RateOfInterest {
    public static void main(String[] args) {
        int rateOfInterest = 0;
        String accountType = "LOAN";
        switch (accountType) {
            case "RD":
                rateOfInterest = 5;
                break;
            case "FD":
                rateOfInterest = 10;
                break;
            default:
                assert false : "No interest for this account"; //line n1
        }
        System.out.println("Rate of interest:" + rateOfInterest);
    }
}
//and the command:
//Visit us athttps://www.examsboost.com/test/1z0-809/java –ea RateOfInterest
//What is the result?
//A. Rate of interest: 0
//B. An AssertionError is thrown./////////////answer
//C. No interest for this account
//D. A compilation error occurs at line n1.

