import java.util.List;

// Main class to demonstrate the notification service
public class Main {
    public static void main(String[] args) {
        // Create a NotificationService instance
        NotificationService notificationService = new NotificationService();

        // Send some notifications
        notificationService.sendNotification("Hello, this is a test notification!");
        notificationService.sendNotification("This is another notification.");

        // Retrieve and display all notifications
        List<Notification> allNotifications = notificationService.getNotifications();
        System.out.println("All Notifications:");
        for (Notification notification : allNotifications) {
            System.out.println(notification.getMessage());
        }
    }
}
