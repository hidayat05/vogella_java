package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaCollections/article.html
 */
public class MapOrDefault {
    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        map.put("Android", 1 + map.getOrDefault("Android", 0));

        map.forEach((k, l) -> System.out.printf("%s %s%n", k, l));
    }

    private static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Eclipse IDE", 0);
        map.put("Eclipse RCP", 0);
        map.put("Git", 0);
        return map;
    }
}
