package A$$AdvancedClassDesign.F$$CreatingNestedClasses.A$$MemberInnerClasses;

public class NestMultipleClassesSample {
     static class A {
        private int x = 10;
        class B {
            private int x = 20;
            class C {
                private int x = 30;
                public void allTheX() {
                    System.out.println(x);
                    System.out.println(this.x);
                    System.out.println(B.this.x);
                    System.out.println(A.this.x);


                } } }
        public static void main(String[] args) {
            A a = new A();
            B b = a.new B();
            B.C c = b.new C();
            c.allTheX();
        }}
}
