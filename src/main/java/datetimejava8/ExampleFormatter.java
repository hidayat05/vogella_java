package datetimejava8;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaDateTimeAPI/article.html
 */
public class ExampleFormatter {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM dd yyyy");
        LocalDate date = LocalDate.of(2015, Month.JULY, 1);
        System.out.println(date.format(formatter));
        System.out.println(date.format(dateTimeFormatter));
        LocalDate date1 = LocalDate.of(2015, Month.JULY, 15);
        System.out.println(date1.format(formatter));
    }
}
