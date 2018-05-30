package G$$Concurrency.D$$UsingConcurrentCollections.C$$WorkingwithConcurrentClasses.UnderstandingCopyOnWriteCollections;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetClass {

    public static void main(String[] args) {
        Set<Integer> list = new CopyOnWriteArraySet<>();
        for(Integer item: list) {
            System.out.print(item+" ");
            list.add(9);
        }
        System.out.println();
        System.out.println("Size: "+list.size());
    }
}
