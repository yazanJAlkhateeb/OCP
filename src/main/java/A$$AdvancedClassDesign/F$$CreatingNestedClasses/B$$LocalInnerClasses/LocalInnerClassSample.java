package A$$AdvancedClassDesign.F$$CreatingNestedClasses.B$$LocalInnerClasses;

public class LocalInnerClassSample {
    private int length = 5;

    public static void main(String[] args) {
        LocalInnerClassSample outer = new LocalInnerClassSample();
        outer.calculate();
    }

    public void calculate() {
         int width = 20;

        class Inner {
            public int multiply() {
                return width*length;
            }
        }
        System.out.println(new Inner().multiply());
    }
}
