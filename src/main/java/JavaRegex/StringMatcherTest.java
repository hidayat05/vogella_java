package JavaRegex;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
 */
public class StringMatcherTest {

    private StringMatcher matcher;

    @Before
    public void setup() {
        matcher = new StringMatcher();
    }

    @Test
    public void testIsTrue() {
        assertTrue(matcher.isTrue("true"));
        assertFalse(matcher.isTrue("true2"));
        assertFalse(matcher.isTrue("True2"));
    }


    @Test
    public void testIsTrueVersion2() {
        assertTrue(matcher.isTrueVersion("true"));
        assertFalse(matcher.isTrueVersion("true2"));
        assertTrue(matcher.isTrueVersion("True"));
    }

    @Test
    public void testIsTrueOrYes() {
        assertTrue(matcher.isTrueOrYes("true"));
        assertTrue(matcher.isTrueOrYes("yes"));
        assertTrue(matcher.isTrueOrYes("Yes"));
        assertFalse(matcher.isTrueOrYes("no"));
    }

    @Test
    public void testContainsTrue() {
        assertTrue(matcher.isContainTrue("thetruewithin"));
    }

    @Test
    public void testIsThreeLetters() {
        assertTrue(matcher.isThreeLetters("abc"));
        assertFalse(matcher.isThreeLetters("abcd"));
    }

    @Test
    public void testisNoNumberAtBeginning() {
        assertTrue(matcher.isNoNumberAtBeninning("abc"));
        assertFalse(matcher.isNoNumberAtBeninning("1abcd"));
        assertTrue(matcher.isNoNumberAtBeninning("a1bcd"));
        assertTrue(matcher.isNoNumberAtBeninning("asdfdsf"));
    }

    @Test
    public void testisIntersection() {
        assertTrue(matcher.isIntersection("1"));
        assertFalse(matcher.isIntersection("abcksdfkdskfsdfdsf"));
        assertTrue(matcher.isIntersection("skdskfjsmcnxmvjwque484242"));
    }

    @Test
    public void testLessThenThreeHundred() {
        assertTrue(matcher.isLessThenThreeHundred("288"));
        assertFalse(matcher.isLessThenThreeHundred("3288"));
        assertFalse(matcher.isLessThenThreeHundred("328 8"));
        assertTrue(matcher.isLessThenThreeHundred("1"));
        assertTrue(matcher.isLessThenThreeHundred("99"));
        assertFalse(matcher.isLessThenThreeHundred("300"));
    }
}
