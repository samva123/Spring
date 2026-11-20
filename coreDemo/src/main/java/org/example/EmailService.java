package org.example;

import org.example.notification.NotificationService;
import org.springframework.stereotype.Component;


    @Component
    public class EmailService implements NotificationService {

        public void sendNotification(){
            System.out.println("Mail sent");
        }
        @Override
        public void sendNoti(){
            System.out.println("email sent ho gaua ");
        }
    }

