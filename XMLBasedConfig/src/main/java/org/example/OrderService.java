package org.example;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
        System.out.println("order created");
    }

    public void pay(){
        paymentService.cash();
        System.out.println("pay nahi order");
    }
}
