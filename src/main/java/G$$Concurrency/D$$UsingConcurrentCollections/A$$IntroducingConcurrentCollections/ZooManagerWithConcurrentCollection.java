package G$$Concurrency.D$$UsingConcurrentCollections.A$$IntroducingConcurrentCollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ZooManagerWithConcurrentCollection {
    private Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();

    public void put(String key, String value) {
        foodData.put(key, value);
    }

    public Object get(String key) {
        return foodData.get(key);
    }
}