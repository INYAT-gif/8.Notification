import java.util.ArrayList;
import java.util.List;

// Define a Notification class to represent a notification
class Notification {
    private String message;

    public Notification(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

// Define a NotificationService class responsible for sending notifications
class NotificationService {
    private List<Notification> notifications;

    public NotificationService() {
        notifications = new ArrayList<>();
    }

    // Method to send a notification
    public void sendNotification(String message) {
        Notification notification = new Notification(message);
        notifications.add(notification);
        // Simulate sending notification (in a real application, this would be sending emails, push notifications, etc.)
        System.out.println("Notification sent: " + message);
    }

    // Method to retrieve all notifications
    public List<Notification> getNotifications() {
        return notifications;
    }
}
