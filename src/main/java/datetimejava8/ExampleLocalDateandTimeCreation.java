package datetimejava8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaDateTimeAPI/article.html
 */
public class ExampleLocalDateandTimeCreation {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        LocalDate date = LocalDate.of(2015, Month.JULY, 13);

        LocalTime time = LocalTime.of(17, 18);
        LocalTime time1 = LocalTime.parse("10:15:30");

        LocalDate localDate = dateTime.toLocalDate();
        Month month = dateTime.getMonth();
        int day = dateTime.getDayOfMonth();
        int minute = dateTime.getMinute();

        LocalDateTime updateDate = dateTime.withDayOfMonth(13).minusYears(2015);
        LocalDateTime plusYears = updateDate.plusDays(25).plusYears(2);

        LocalDateTime newDate = dateTime.with(TemporalAdjusters.lastDayOfMonth());
        LocalTime truncateDateSeconds = time1.truncatedTo(ChronoUnit.SECONDS);
    }
}

