package QuestionAndAnswers.q110;
//Given:
 enum USCurrency {
PENNY (1),
NICKLE(5),
DIME (10),
QUARTER(25);
private int value;
 USCurrency(int value) {
this.value = value;
}
public int getValue() {return value;}
}
public class Coin {
    public static void main(String[] args) {
        USCurrency usCoin = USCurrency.DIME;

        System.out.println(usCoin.getValue());
    }
}
/*
Which two modifications enable the given code to compile?
A. Nest the USCurrency enumeration declaration within the Coin class.
B. Make the USCurrency enumeration constructor private.///answer
C. Remove the new keyword from the instantion of usCoin.///answer
D. Make the getter method of value as a static method.
E. Add the final keyword in the declaration of value.*/