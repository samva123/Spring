package org.example.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

    //@Primary
//    @Qualifier("cp")
//   @Component
    public class EmailService implements NotificationService {

        public void sendNotification(){
            System.out.println("Mail sent");
        }
        @Override
        public void sendNoti(){
            System.out.println("email sent ho gaua ");
        }
    }

