package task1;

public class Main {
    public static void main(String[] args) {
        Message emailMessage = MessageFactory.createMessage("email");
        emailMessage.send("user@example.com", "Hello via Email!");

        Message smsMessage = MessageFactory.createMessage("sms");
        smsMessage.send("123-456-7890", "Hello via SMS!");

        Message pushNotification = MessageFactory.createMessage("push");
        pushNotification.send("User123", "Hello via Push Notification!");
    }
}

