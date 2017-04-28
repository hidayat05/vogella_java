package JavaRegex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
 */
public class CheckNumber {

    @Test
    public void testSimpleTrue() {
        String s = "1233";
        assertTrue(test(s));
        s = "0";
        assertFalse(test(s));
        s = "29 Kasdkf 2300 Kdsdf";
        assertTrue(test(s));
        s = "99900234";
        assertTrue(test(s));

    }

    private static boolean test(String string) {
        Pattern pattern = Pattern.compile("\\d{3}");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }
}
