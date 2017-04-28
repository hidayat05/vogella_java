package JavaRegex;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
 */
public class RegexTestStrings {

    public static final String EXAMPLE_STRNG = "This is my small example "
            + "string which I'm going to " + "use for pattern matching.";

    public static void main(String[] args) {
        System.out.println(EXAMPLE_STRNG.matches("\\w.*"));
        String[] splitString = (EXAMPLE_STRNG.split("\\s+"));
        System.out.println(splitString.length);
        for (String string : splitString) {
            System.out.println(string);
        }

        System.out.println(EXAMPLE_STRNG.replaceAll("\\s+", "\t"));
    }
}
