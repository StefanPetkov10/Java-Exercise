package task1;

public class SMSMessage implements Message {
    @Override
    public void send(String recipient, String content) {
        System.out.println("Sending SMS to " + recipient + " with content: " + content);
    }
}