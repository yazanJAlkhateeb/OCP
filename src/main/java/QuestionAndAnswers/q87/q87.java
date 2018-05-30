package QuestionAndAnswers.q87;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class q87 {
    public static void main(String[] args) {
        //  Given the code fragment:
        Map<Integer, String> unsortMap = new HashMap<>();
        unsortMap.put(10, "z");
        unsortMap.put(5, "b");
        unsortMap.put(1, "d");
        unsortMap.put(7, "e");
        unsortMap.put(50, "j");
        Map<Integer, String> treeMap = new TreeMap<Integer, String>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo
                        (o1);
            }
        });
        treeMap.putAll(unsortMap);
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }
    //A. A compilation error occurs.
    //B. d b e z j
    //C. j z e b d///answer
    //D. z b d e j
}
