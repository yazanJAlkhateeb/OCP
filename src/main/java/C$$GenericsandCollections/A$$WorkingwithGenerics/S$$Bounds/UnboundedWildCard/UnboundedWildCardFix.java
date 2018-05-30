package C$$GenericsandCollections.A$$WorkingwithGenerics.S$$Bounds.UnboundedWildCard;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildCardFix {
    /*we cannot assign a List<String> to a List<Object> .
That’s fine; we don’t really need a List<Object> . What we really need is a List of “what-
ever.” That’s what List<?> is. The following code does what we expect:*/
    public static void printList(List<?> list) {
        for (Object x : list) System.out.println(x);
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);
    }
}
