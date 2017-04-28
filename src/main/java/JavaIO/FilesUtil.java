package JavaIO;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 */
public class FilesUtil {

    public static String readTextFile(String fileName) throws Exception {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static List<String> readTextFileByLines(String fileName) throws Exception {
        return Files.readAllLines(Paths.get(fileName));
    }

    public static void writeToTextFile(String fileName, String content) throws Exception {
        Files.write(Paths.get(fileName), content.getBytes(), StandardOpenOption.CREATE);
    }
}
