package org.example;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

//    NotificationService noti ;
//
//    public OrderService(NotificationService noti){
//        this.noti = noti;
//    }

    public void placeOrder(){
        System.out.println("order placed");
        //noti.sendNoti();

    }
}
