package shaikfn.springioc_lab2.notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")          // bean name = "email"
@Primary                   // DEFAULT: Email wins when no qualifier is used
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email: Sending Email: " + message);
    }
}
