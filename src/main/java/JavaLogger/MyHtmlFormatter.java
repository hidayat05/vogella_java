package JavaLogger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/Logging/article.html
 */
public class MyHtmlFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        StringBuffer buffer = new StringBuffer(1000);
        buffer.append("<tr>\n");

        if (record.getLevel().intValue() >= Level.WARNING.intValue()) {
            buffer.append("\t<td style=\"color:red\">");
            buffer.append("<b>");
            buffer.append(record.getLevel());
            buffer.append("</b>");
        } else {
            buffer.append("\t<td>");
            buffer.append(record.getLevel());
        }
        buffer.append("</td>\n");
        buffer.append("\t<td>");
        buffer.append(calcDate(record.getMillis()));
        buffer.append("</td>\n");
        buffer.append("\t<td>");
        buffer.append(formatMessage(record));
        buffer.append("</td>\n");
        buffer.append("</tr>\n");

        return buffer.toString();
    }

    private String calcDate(long millisecs) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd,yyyy HH:mm");
        Date resultDate = new Date(millisecs);
        return dateFormat.format(resultDate);
    }

    public String getHead(Handler h) {
        return "<!DOCTYPE html>\n<head>\n<style>\n"
                + "table { width: 100% }\n"
                + "th { font:bold 10pt Tahoma; }\n"
                + "td { font:normal 10pt Tahoma; }\n"
                + "h1 {font:normal 11pt Tahoma;}\n"
                + "</style>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1>" + (new Date()) + "</h1>\n"
                + "<table border=\"0\" cellpadding=\"5\" cellspacing=\"3\">\n"
                + "<tr align=\"left\">\n"
                + "\t<th style=\"width:10%\">Loglevel</th>\n"
                + "\t<th style=\"width:15%\">Time</th>\n"
                + "\t<th style=\"width:75%\">Log Message</th>\n"
                + "</tr>\n";
    }

    public String getTail(Handler handler) {
        return "</table>\n</body>\n</html>";
    }

}
