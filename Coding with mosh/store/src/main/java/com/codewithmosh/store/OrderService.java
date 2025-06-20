package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

   public OrderService(@Qualifier("paypal") PaymentService paymentService){
       this.paymentService = paymentService;

    }

    public void PlaceOrder(){
        paymentService.processPayment(30);
    }

    public void setPaymentService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

}
