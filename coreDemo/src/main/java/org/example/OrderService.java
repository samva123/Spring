package org.example;

public class OrderService {

    EmailService noti = new EmailService();

    public void placeOrder(){
        System.out.println("order placed");
        noti.sendNotification();
    }
}
