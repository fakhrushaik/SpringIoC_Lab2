package shaikfn.springioc_lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import shaikfn.springioc_lab2.notification.NotificationManager;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        NotificationManager manager = ctx.getBean(NotificationManager.class);
        manager.sendNotification("Hello, this is a test message!");
    }
}
