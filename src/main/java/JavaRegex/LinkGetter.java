package JavaRegex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
 */
public class LinkGetter {

    private Pattern htmlTag;
    private Pattern link;

    public LinkGetter() {
        htmlTag = Pattern.compile("<a\\b[^>]*href=\"[^>]*>(.*?)</a>");
        link = Pattern.compile("href=\"[^>]*\">");
    }

    public List<String> getLinks(String url) {
        List<String> links = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));

            String s;
            StringBuilder builder = new StringBuilder();
            while ((s = bufferedReader.readLine()) != null) {
                builder.append(s);
            }

            Matcher tagMatch = htmlTag.matcher(builder.toString());
            while (tagMatch.find()) {
                Matcher matcher = link.matcher(tagMatch.group());
                matcher.find();
                String link = matcher.group().replaceFirst("href=\"", "")
                        .replaceFirst("\">", "")
                        .replaceFirst("\"[\\s]?target=\"[a-zA-Z_0-9]*", "");

                if (valid(link)) {
                    links.add(makeAbsolute(url, link));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return links;
    }

    private boolean valid(String string) {
        return string.matches("javascript:.*|mailto:.*");
    }

    private String makeAbsolute(String url, String link) {
        if (link.matches("http://.*")) {
            return link;
        }
        if (link.matches("/.*") && url.matches(".*$[^/]")) {
            return url + "/" + link;
        }
        if (link.matches("[^/].*") && url.matches(".*[^/]")) {
            return url + "/" + link;
        }
        if (link.matches("/.*") && url.matches(".*[/]")) {
            return url + link;
        }
        if (link.matches("/.*") && url.matches(".*[^/]")) {
            return url + link;
        }
        throw new RuntimeException("Cannot make the link absolute. Url: " + url
                + " Link " + link);
    }

}
