package JavaRegex;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
 */
public class EitherOrCheck {

    @Test
    public void testSimple() {
        String s = "humbapumpa jim";
        assertTrue(s.matches(".*(jim|joe).*"));
        s = "humbapumpa jom";
        assertFalse(s.matches(".*(jim|joe).*"));
        s = "humbapumpa joe";
        assertTrue(s.matches(".*(jim|joe).*"));
        s = "humbapumpa joe jim";
        assertTrue(s.matches(".*(jim|joe).*"));
    }
}
