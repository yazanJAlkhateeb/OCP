package QuestionAndAnswers.q18;

/*Given:*/
class FuelNotAvailException extends Exception {
}

public class Vehicle {
    void ride() throws Exception{// FuelNotAvailException {// the problem is here
//line n1
        System.out.println("Happy Journey!");
    }
}

class SolarVehicle extends Vehicle {
    /*and the code fragment:*/
    public static void main(String[] args) throws FuelNotAvailException, Exception {
        Vehicle v = new SolarVehicle();
        v.ride();
    }

    public void ride() throws Exception {
//line n2
        super.ride();
    }
}
/*
Which modification enables the code fragment to print Happy Journey!?
A. Replace line n1 with public void ride() throws FuelNotAvailException {
B. Replace line n1 with protected void ride() throws Exception {///answer
C. Replace line n2 with void ride() throws Exception {
D. Replace line n2 with private void ride() throws FuelNotAvailException {*/

