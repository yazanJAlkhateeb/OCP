package A$$AdvancedClassDesign.F$$CreatingNestedClasses.A$$MemberInnerClasses;

public class  MemberInnerClassSample {
    private String greeting = "Hi";

    public static void main(String[] args) {
        MemberInnerClassSample memberInnerClassSample = new MemberInnerClassSample();
        MemberInnerClassSample.Inner inner=memberInnerClassSample.new Inner();
        inner.go();
        memberInnerClassSample.callInner();
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    protected class Inner {
        public int repeat = 3;

        public void go() {
            for (int i = 0; i < repeat; i++)
                System.out.println(greeting);
        }
    }
}