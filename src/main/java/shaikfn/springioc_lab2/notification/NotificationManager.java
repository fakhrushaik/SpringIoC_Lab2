package shaikfn.springioc_lab2.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {

    private final NotificationService notificationService;

    // Version A (default = Email because it's @Primary):
    //public NotificationManager(NotificationService notificationService) {
    //    this.notificationService = notificationService;
    //}

    // Version B (switch to SMS):
    public NotificationManager(@Qualifier("sms") NotificationService notificationService) {
         this.notificationService = notificationService;
     }

    public void sendNotification(String message) {
        notificationService.send(message);
    }
}
