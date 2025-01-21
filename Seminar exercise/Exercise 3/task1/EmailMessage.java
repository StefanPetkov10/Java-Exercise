package task1;

public class EmailMessage implements Message {
    @Override
    public void send(String recipient, String content) {
        System.out.println("Sending Email to " + recipient + " with content: " + content);
    }
}