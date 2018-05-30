package QuestionAndAnswers.q2;

public class Shop {
    private final double discount = 0.25;
    private Cake c = new Cake();

    public void makeReady() {
        c.bake(10, 120);
    }
}