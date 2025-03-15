package com.codewithmosh.store;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

    @Autowired
    public OrderService (@Qualifier("Stripe") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }
//
//    public void setPaymentService() {
//        this.paymentService
//    }
//    @PostConstruct
//    public void init() {
//        System.out.println("posyconstruct");
//    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }
}
