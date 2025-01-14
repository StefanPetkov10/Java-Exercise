import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ReaderTask implements Runnable  {
    private final List<Integer> sharedList;

    public ReaderTask(List<Integer> sharedList) {
        this.sharedList = sharedList;
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (sharedList) {
                    if (!sharedList.isEmpty()) {
                        Integer number = sharedList.remove(0);
                        System.out.println("Прочетено от списъка: " + number);
                    }


                    try (BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"))) {
                        String lastLine = null;
                        String line;
                        while ((line = reader.readLine()) != null) {
                            lastLine = line;
                        }
                        if (lastLine != null) {
                            System.out.println("Прочетено от файла: " + lastLine);
                        }
                    } catch (IOException e) {
                        System.err.println("Грешка при четене от файла: " + e.getMessage());
                    }
                }

                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.err.println("ReaderTask беше прекъсната: " + e.getMessage());
        }
    }
}