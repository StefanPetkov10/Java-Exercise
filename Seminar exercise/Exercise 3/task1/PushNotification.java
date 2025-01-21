package task1;

public class PushNotification implements Message {
    @Override
    public void send(String recipient, String content) {
        System.out.println("Sending Push Notification to " + recipient + " with content: " + content);
    }
}