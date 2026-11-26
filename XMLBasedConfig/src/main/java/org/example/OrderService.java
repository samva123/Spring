package org.example;


import org.example.Package.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

       private PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
        System.out.println("order created");
    }


//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void pay(){
        paymentService.cash();
        System.out.println("pay nahi order");
    }
}
