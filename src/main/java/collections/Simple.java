package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 */
public class Simple {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 4, 3, 7, 2, 1);

        Collections.sort(list);

        list.forEach(System.out::println);
    }
}
