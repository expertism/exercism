import java.util.Locale;

public class LogLevels {
    
    public static String message(String logLine) {
        int position = logLine.indexOf(":") +2;
        String split = logLine.substring(position).trim();

        return split;
    }

    public static String logLevel(String logLine) {
        return logLine.substring(1, logLine.indexOf("]"))
                .toLowerCase(Locale.ROOT);

    }

    public static String reformat(String logLine) {
        return message(logLine) + "" + " (" + logLevel(logLine) + ")";
    }
}
