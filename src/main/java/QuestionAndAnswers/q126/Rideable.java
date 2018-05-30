package QuestionAndAnswers.q126;

interface Rideable {
    Car getCar(String name);
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Rideable rider = Car::new;
        Car vehicle = rider.getCar("MyCar");
        /*A. Car auto = Car (“MyCar”): : new;
B. Car auto = Car : : new;
Car vehicle = auto : : getCar(“MyCar”);
C. Rideable rider = Car : : new;///answer
Car vehicle = rider.getCar(“MyCar”);
D. Car vehicle = Rideable : : new : : getCar(“MyCar”);*/
    }
}