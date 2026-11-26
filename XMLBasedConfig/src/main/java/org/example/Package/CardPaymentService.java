package org.example.Package;

public class CardPaymentService implements PaymentService{


    @Override
    public void cash() {
        System.out.println("card kar");
    }
}
