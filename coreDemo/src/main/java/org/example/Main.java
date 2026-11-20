package org.example;

import org.example.notification.NotificationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        NotificationService noti = new EmailService();
//        OrderService order = new OrderService(noti);
//        order.placeOrder();
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // spring container ko start karo using annotation based configuration
        OrderService order  = context.getBean(OrderService.class);
        order.placeOrder();

        EmailService email = context.getBean(EmailService.class);
        email.sendNotification();





    }


}