package JavaRegex;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
 */
public class CheckPhone {

    @Test
    public void testSimpleTrue() {
        String pattern = "\\d\\d\\d([,\\s])?\\d\\d\\d\\d";
        String s = "1233323322";
        assertFalse(s.matches(pattern));
        s = "1233323";
        assertTrue(s.matches(pattern));
        s = "123 3323";
        assertTrue(s.matches(pattern));
    }
}
