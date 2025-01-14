import java.util.ArrayList;
import java.util.List;

public class MultiThreadedFileHandlerWithRunnable {

    public static void main(String[] args) {

        List<Integer> sharedList = new ArrayList<>();

        Thread writerThread = new Thread(new WriterTask(sharedList));
        Thread readerThread = new Thread(new ReaderTask(sharedList));

        writerThread.start();
        readerThread.start();
    }
}