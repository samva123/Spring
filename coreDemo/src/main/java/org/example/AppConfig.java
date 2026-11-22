package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    @Bean
    public User createUSer(){
        return new User("Aditya",28);
    }

    @Bean
    public NotificationService createNoti(){
        return new EmailService();
    }

    @Bean
    public OrderService createOrder(NotificationService noti){
        return new OrderService(noti);

//        one other way
//         we have to remove parameter of createOrder then below steps
//        1. NotificationService noti = createNoti();
//        2. OrderService order =  new OrderService();
//        3. order.set...(noti);(if confused see it in the 5th video)
//        4. return order;
    }

}
