package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaCollections/article.html
 */
public class MapTester {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        fillData(map);


        map.forEach((k, l) -> System.out.printf("%s %s%n", k, l));

        map.put("iPhone", "Created by Apple");
        map.remove("Android");

        map.forEach((k, l) -> System.out.printf("%s %s%n", k, l));


    }

    private static void fillData(Map<String, String> map) {
        map.put("Android", "Mobile");
        map.put("Eclipse IDE", "Java");
        map.put("Eclipse RCP", "Java");
        map.put("Git", "Version Control System");
    }
}
