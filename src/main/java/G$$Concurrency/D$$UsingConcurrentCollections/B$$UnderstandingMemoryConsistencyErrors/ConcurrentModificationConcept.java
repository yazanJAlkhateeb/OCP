package G$$Concurrency.D$$UsingConcurrentCollections.B$$UnderstandingMemoryConsistencyErrors;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationConcept {

    public static void main(String[] args) {


    /*   A memory consistency error occurs when two threads have inconsistent views of
       what should be the same data. Conceptually, we want writes on one thread to be available
       to another thread if it accesses the concurrent collection after the write has occurred.
       When two threads try to modify the same non-concurrent collection, the JVM may
   throw a ConcurrentModificationException at runtime. In fact, it can happen with a single
       thread. Take a look at the following code snippet:*/

        Map<String, Object> foodData = new HashMap<String, Object>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for (String key : foodData.keySet())
            foodData.remove(key);

        /*This snippet will throw a ConcurrentModificationException at runtime, since the
        iterator keyset () is not properly updated after the first element is removed.Changing the
        first line to use a ConcurrentHashMap will prevent the code from throwing an exception at
        runtime:*/
        Map<String, Object> foodDataWithModification = new ConcurrentHashMap<String, Object>();
        foodDataWithModification.put("penguin", 1);
        foodDataWithModification.put("flamingo", 2);
        for (String key : foodDataWithModification.keySet())
            foodDataWithModification.remove(key);
    }
}