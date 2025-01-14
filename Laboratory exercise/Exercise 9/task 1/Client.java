import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private String myName;

    public static void main(String[] args) {
        new Client().start();
    }

    private void start (){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your name: ");
        myName = console.nextLine();

        try {
            Socket socket = new Socket("localhost", 2101);
            Scanner in = new Scanner(socket.getInputStream());
            PrintStream out = new PrintStream(socket.getOutputStream());

            Runnable write = () -> {
                while (true) {
                    String line = console.nextLine();
                    out.println(myName + ": " + line);
                    if(line.contains("quit"))
                    {
                        in.close();
                        out.close();

                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return;
                    }
                }
            };
            Runnable read = () -> {
                while (true) {
                    if(in.hasNextLine())
                    {
                        System.out.println(in.nextLine());
                    }
                }
            };
            new Thread(write).start();
            new Thread(read).start();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
