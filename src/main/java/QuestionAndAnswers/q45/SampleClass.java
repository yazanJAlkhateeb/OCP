package QuestionAndAnswers.q45;
//Given:
public class SampleClass {
public static void main(String[] args) {
AnotherSampleClass asc = new AnotherSampleClass(); SampleClass sc = new SampleClass();
sc = asc;
System.out.println("sc: " + sc.getClass());
System.out.println("asc: " + asc.getClass());
}}
class AnotherSampleClass extends SampleClass {
}
/*What is the result?
A. sc: class Object
asc: class AnotherSampleClass
B. sc: class SampleClass
asc: class AnotherSampleClass
C. sc: class AnotherSampleClass
asc: class SampleClass
D. sc: class AnotherSampleClass///answer
asc: class AnotherSampleClass*/