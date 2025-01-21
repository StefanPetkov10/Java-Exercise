package task2;

public class Application {
    private final Logger logger;

    public Application(Logger logger) {
        this.logger = logger;
    }

    public void logInfo(String message) {
        logger.log(message);
    }

    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Application app1 = new Application(consoleLogger);
        app1.logInfo("This is a console log message.");

        Logger fileLogger = new FileLogger("logfile.txt");
        Application app2 = new Application(fileLogger);
        app2.logInfo("This is a file log message.");
    }
}