package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaCollections/article.html
 */
public class ComputeIfAbsent {

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        Integer calculate = map.computeIfAbsent("Java", it -> 0);
        System.out.println(calculate);

        map.keySet().forEach(key -> System.out.println(key + "" + map.get(key)));
    }


    private static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Eclipse IDE", 0);
        map.put("Eclipse RCP", 0);
        map.put("Git", 0);
        map.put("Groovy", 0);
        return map;
    }
}
