package org.example;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    public OrderService(){
        System.out.println("order created");
    }

    public void placeOrder(){
        System.out.println("order placed");
    }
}
