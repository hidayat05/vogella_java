package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaCollections/article.html
 */
public class MyArrayList {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("List", "Misal");

        List<String> anotherList = new ArrayList<>();
        anotherList.add("list");
        anotherList.add("misal");

        list.forEach(System.out::println);
        anotherList.forEach(System.out::println);
    }
}
