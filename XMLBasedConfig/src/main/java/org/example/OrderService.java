package org.example;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    public OrderService(){
        System.out.println("order created");
    }

    public void pay(){
        System.out.println("pay nahi order");
    }
}
