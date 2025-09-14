package shaikfn.springioc_lab2.notification;

import org.springframework.stereotype.Service;

@Service("sms")            // bean name = "sms"
public class SMSNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("SMS: Sending SMS: " + message);
    }
}
