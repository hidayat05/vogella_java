package JavaIO;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaIO/article.html
 */
public class ReadMANIFESTFile {

    public static void main(String[] args) throws Exception {
        String versionString = readStreamOfLinesUsingFiles();
        System.out.println(versionString);

    }


    private static String readStreamOfLinesUsingFiles() throws Exception {
        Stream<String> lines = Files.lines(Paths.get("META-INF", "MANIFEST.MF"));
        Optional<String> versionString = lines.filter(s -> s.contains("Bundle-Version")).map(e -> e.substring(15).trim()).findFirst();

        lines.close();
        return versionString.orElse("");
    }
}
