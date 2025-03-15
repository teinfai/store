package com.codewithmosh.store;

import org.springframework.stereotype.Service;

@Service("Paypal")
public class PayPalService implements PaymentService{
    @Override
    public void processPayment (double amount) {
        System.out.println("Paypal");
        System.out.println("Paypalpayment = " + amount);
    }
}
