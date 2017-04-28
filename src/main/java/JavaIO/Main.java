package JavaIO;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaIO/article.html
 */
public class Main {

    public static void main(String[] args) throws Exception{
        String input = FilesUtil.readTextFile("vogella.iml");
        System.out.println(input);
        FilesUtil.writeToTextFile("copy.txt", input);

        System.out.println(FilesUtil.readTextFile("copy.txt"));

        FilesUtil.readTextFileByLines("vogella.iml");
        Path path = Paths.get("vogella.iml");
    }
}
