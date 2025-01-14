import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class WriterTask implements Runnable   {
    private final List<Integer> sharedList;

    public WriterTask(List<Integer> sharedList) {
        this.sharedList = sharedList;
    }

    @Override
    public void run() {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.println("Въведете числа (Ctrl+C за прекратяване):");
            while (true) {
                int number = scanner.nextInt();

                synchronized (sharedList) {
                    sharedList.add(number);
                    System.out.println("Числото " + number + " е добавено в списъка.");


                    try (FileWriter writer = new FileWriter("numbers.txt", true)) {
                        writer.write(number + "\n"); // Записваме числото с нов ред
                    } catch (IOException e) {
                        System.err.println("Грешка при запис във файла: " + e.getMessage());
                    }
                }
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.err.println("WriterTask беше прекъсната: " + e.getMessage());
        }
    }
}
