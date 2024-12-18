import Model.DebugLogProcessor;
import Model.ErrorLogProcessor;
import Model.InfoLogProcessor;
import Model.LogProcessor;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "exception happens");
        logProcessor.log(LogProcessor.DEBUG, "debugging happens");
        logProcessor.log(LogProcessor.INFO, "info available");
    }
}