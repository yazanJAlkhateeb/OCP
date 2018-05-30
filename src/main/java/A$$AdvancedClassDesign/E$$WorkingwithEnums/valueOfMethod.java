package A$$AdvancedClassDesign.E$$WorkingwithEnums;

public class valueOfMethod {
    /*You can also create an enum from a String . This is helpful when working with older
code. The String passed in must match exactly, though.
*/
    public static void main(String[] args) {
        EnumSample.Season s1 = EnumSample.Season.valueOf("SUMMER");
       // EnumSample.Season s2 = EnumSample.Season.valueOf("summer");
        System.out.println(s1);
        //System.out.println(s2);
// SUMMER
// exception
    }/*
The first statement works and assigns the proper enum value to s1 . The second statement
encounters a problem. There is no enum value with the lowercase name “summer.” Java
throws up its hands in defeat and throws an IllegalArgumentException*/
}
