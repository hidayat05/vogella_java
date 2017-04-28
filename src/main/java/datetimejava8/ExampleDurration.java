package datetimejava8;

import java.time.Duration;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaDateTimeAPI/article.html
 */

public class ExampleDurration{
    public static void main(String[] args) {

        Duration duration = Duration.ofHours(5);
        Duration plusMinute = duration.plusMinutes(20);
    }
}
