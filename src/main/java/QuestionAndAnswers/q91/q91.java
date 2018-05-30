package QuestionAndAnswers.q91;

public class q91 {
    /*  Given:
     */abstract class Shape {
        Shape() {
            System.out.println("Shape");
        }

        protected void area() {
            System.out.println("Shape");
        }
    }

    class Square extends Shape {
        int side;

        Square(int side) {
            /* insert code here */
            this.side = side;
        }

        public void area() {
            System.out.println("Square");
        }
    }

    class Rectangle extends Square {
        int len, br;

        Rectangle(int x, int y) {
            /* insert code here */
            super(5);
            len = x;
            br = y;
        }

        public void area() {
            System.out.println("Rectangle");
        }
    }
    /*   Which two modifications enable the code to compile?
     */
//A. At line 1, remove abstract
//B. At line 9, insert super ( );
//C. At line 12, remove public
//D. At line 17, insert super (x);answer
//E. At line 17, insert super (); super.side = x;
//F. At line 20, use public void area ( ) {///answer
}
