package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaCollections/article.html
 */
public class ConverterMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        fillData(map);

        String[] strings = map.keySet().toArray(new String[map.keySet().size()]);
        for (String string : strings) {
            System.out.println(string);
        }

        List<String> list = new ArrayList<>(map.keySet());
        for (String string : list) {
            System.out.println(string);
        }

    }

    private static void fillData(Map<String, String> map) {
        map.put("Android", "Mobile");
        map.put("Eclipse IDE", "Java");
        map.put("Eclipse RCP", "Java");
        map.put("Git", "Version Control System");
    }

}
