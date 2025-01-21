package task2;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    private final String fileName;

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log(String message) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("FileLogger: " + message + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}