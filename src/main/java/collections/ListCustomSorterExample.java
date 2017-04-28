package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaCollections/article.html
 */
public class ListCustomSorterExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 4, 3, 7, 2, 1);

        Collections.sort(list, (l, k) -> (l > k ? -1 : (l == k ? 0 : 1)));

        list.forEach(System.out::println);
    }
}
