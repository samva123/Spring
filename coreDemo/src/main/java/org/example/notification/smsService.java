package org.example.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//    @Component
//    @Qualifier
    public class smsService implements NotificationService {

        public void sendsms(){
            System.out.println("sms gaya ji");
        }

        @Override
        public void sendNoti(){
            System.out.println("sms to jaake rahega");

        }
    }
