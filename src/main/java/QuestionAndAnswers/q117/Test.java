package QuestionAndAnswers.q117;
//Given:
public class Test<T> {
private T t;
public T get () {
return t;
}
public void set (T t) {
this.t = t;
}

public static void main (String args [ ] ) {
Test<String> type = new Test<>();
Test type1 = new Test();
//line n1
type.set("Java");
type1.set(100);
//line n2
System.out.print(type.get() + " " + type1.get());
}
}
/*What is the result?
A. Java 100///answer
B. java.lang.string@<hashcode>java.lang.Integer@<hashcode>
C. A compilation error occurs. To rectify it, replace line n1 with:
Test<Integer> type1 = new Test<>();
D. A compilation error occurs. To rectify it, replace line n2 with:
type1.set (Integer(100));*/