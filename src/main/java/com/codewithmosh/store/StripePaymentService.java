package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Stripe")
@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout:3000}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
    private List<String> supportedCurrencies;




    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe");
        System.out.println("amount = " + amount);
        System.out.println("API URL: " + apiUrl);
        System.out.println("Enable: " + enabled);
        System.out.println("Timeout: " + timeout);
        System.out.println("Supported C: " + supportedCurrencies);

    }
}
