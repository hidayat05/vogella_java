package collections;

import java.util.Arrays;
import java.util.List;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaCollections/article.html
 */
public class ListExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 1, 4, 5, 6, 6);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
