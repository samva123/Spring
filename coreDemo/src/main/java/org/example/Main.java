package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

//      NotificationService noti = new EmailService();
//      OrderService order = new OrderService(noti);
//      order.placeOrder();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // spring container ko start karo using annotation based configuration

        OrderService order  = context.getBean(OrderService.class);
        order.placeOrder();

        EmailService email = context.getBean(EmailService.class);
        email.sendNotification();

//        User user = context.getBean(User.class);
//        System.out.println(user.getName());




    }


}