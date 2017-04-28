package collections;

import java.util.Arrays;
import java.util.List;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaCollections/article.html
 */
public class ListSorter {

    public static void main(String[] args) {
        System.out.println("Sorting with natural order");

        List<String> li = createList();
        li.sort(null);
        li.forEach(System.out::println);

        System.out.println("Sorting with Lamda expresion comparison");
        List<String> list = createList();
        list.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        list.forEach(System.out::println);

        System.out.println("Sorting with Methode reference");
        List<String> listed = createList();
        listed.sort(String::compareToIgnoreCase);
        listed.forEach(System.out::println);

    }

    private static List<String> createList() {
        return Arrays.asList("iPhone", "Ubuntu", "Android", "Mac Os X");
    }
}
