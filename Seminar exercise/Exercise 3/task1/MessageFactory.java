package task1;

public class MessageFactory {
    public static Message createMessage(String type) {
        switch (type.toLowerCase()) {
            case "email":
                return new EmailMessage();
            case "sms":
                return new SMSMessage();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown message type: " + type);
        }
    }
}