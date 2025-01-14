import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server {
    private final List<PrintStream> clients = new ArrayList<>();

    private void start() {
        try (ServerSocket serverSocket = new ServerSocket(2101)) {
            System.out.println("Server started on port 2101...");

            while (true) {
                Socket client = serverSocket.accept();
                System.out.println("New client connected: " + client.getInetAddress());

                Thread clientThread = new Thread(() -> {
                    try (Scanner in = new Scanner(client.getInputStream());
                         PrintStream out = new PrintStream(client.getOutputStream())) {

                        synchronized (clients) {
                            clients.add(out);
                        }
                        System.out.println("Client added to the list.");

                        while (true) {
                            if (!in.hasNextLine()) break;

                            String line = in.nextLine();
                            if (line.equalsIgnoreCase("quit")) {
                                System.out.println("Client disconnected: " + client.getInetAddress());
                                break;
                            }

                            System.out.println("Received: " + line);

                            synchronized (clients) {
                                for (PrintStream clientOut : clients) {
                                    clientOut.println(line);
                                }
                            }
                        }
                    } catch (IOException e) {
                        System.err.println("Client handling error: " + e.getMessage());
                    } finally {
                        try {
                            client.close();
                        } catch (IOException e) {
                            System.err.println("Error closing client socket: " + e.getMessage());
                        }

                        synchronized (clients) {
                            clients.removeIf(PrintStream::checkError);
                            System.out.println("Disconnected clients removed.");
                        }
                    }
                });

                clientThread.start();
            }
        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Server().start();
    }
}
