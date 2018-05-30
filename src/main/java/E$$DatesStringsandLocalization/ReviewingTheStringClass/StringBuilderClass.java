package E$$DatesStringsandLocalization.ReviewingTheStringClass;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder b = new StringBuilder();
        b.append(12345).append('-');
// 6
        System.out.println(b.length());
// 5
        System.out.println(b.indexOf("-"));
// 3
        System.out.println(b.charAt(2));
        StringBuilder b2 = b.reverse();
        System.out.println(b.toString());
        System.out.println(b == b2);
        System.out.println(b);

    }
}
