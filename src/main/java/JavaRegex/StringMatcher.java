package JavaRegex;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 */
public class StringMatcher {

    public boolean isTrue(String string) {
        return string.matches("true");
    }

    public boolean isTrueVersion(String string) {
        return string.matches("[tT]rue");
    }

    public boolean isTrueOrYes(String string) {
        return string.matches("[tT]rue|[yY]es");
    }

    public boolean isContainTrue(String string) {
        return string.matches(".*true.*");
    }

    public boolean isThreeLetters(String string) {
        return string.matches("[a-zA-Z]{3}");
    }

    public boolean isNoNumberAtBeninning(String string) {
        return string.matches("^[^\\d].*");
    }

    public boolean isIntersection(String s){
        return s.matches("([\\w&&[^b]])*");
    }

    public boolean isLessThenThreeHundred(String string) {
        return string.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*");
    }
}
