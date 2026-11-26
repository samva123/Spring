package org.example;

public class PaymentService {

    private String type;
    public PaymentService(String type){
        this.type = type;
        System.out.println("created payment");
    }

    void cash(){
        System.out.println("cash de diya and " + type );
    }
}
