package collections;

import java.util.Arrays;
import java.util.List;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaCollections/article.html
 */
public class RemoveIfList {

    public static void main(String[] args) {
        System.out.println("Demos remove");
        List<String> list = createList();
        list.removeIf(s-> s.contains("X"));
        list.forEach(System.out::println);
    }

    private static List<String> createList() {
        return Arrays.asList("iPhone", "Ubuntu", "Android", "Mac OS X");
    }
}
