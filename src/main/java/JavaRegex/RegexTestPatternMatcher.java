package JavaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 */
public class RegexTestPatternMatcher {

    public static final String EXAMPLE_TEST = "This is my small example string which I'm going to use for pattern matching.";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(EXAMPLE_TEST);

        while (matcher.find()) {
            System.out.println("Start Index: " + matcher.start());
            System.out.println("End Index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }

        Pattern replace = Pattern.compile("\\s+");
        Matcher matcher1 = replace.matcher(EXAMPLE_TEST);
        System.out.println(matcher1.replaceAll("\t"));
    }
}
