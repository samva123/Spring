package org.example;

import org.example.notification.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    NotificationService noti ;

//    @Autowired
//    public OrderService(NotificationService noti){
//        this.noti = noti;
//    }

    @Autowired
    public void setNoti(NotificationService noti) {
        this.noti = noti;
    }

    public void placeOrder(){
        System.out.println("order placed");
        noti.sendNoti();

    }
}
