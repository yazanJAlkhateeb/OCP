package A$$AdvancedClassDesign.D$$CodingequalsAnDhashCodeAnDtoString.equals;

public class Concept {
    /*Checking if two objects are equivalent uses the equals() method, or at
least it does if the developer implementing the method overrides equals() .
*/
    public static void main(String[] args) {
        String s1 = new String("lion");
        String s2 = new String("lion");
        System.out.println(s1.equals(s2));//true
        StringBuilder sb1 = new StringBuilder("lion");
        StringBuilder sb2 = new StringBuilder("lion");
        System.out.println(sb1.equals(sb2));//false
        /*String does have an equals() method. It checks that the values are the same.
StringBuilder uses the implementation of equals() provided by Object , which simply
checks if the two objects being referred to are the same.*/
    }
}
