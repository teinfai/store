package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("EMAIL")
@Primary
public class EmailNotificationService implements NotificationService {

    @Value("${mail.host}")
    private String host;

    @Value("${mail.port}")
    private String port;

    @Override
    public void SendMessage(String message, String recipientEmail) {
        System.out.println("Sent successful !!!!");
        System.out.println("Email Sent Message: " + message);
        System.out.println("Email Sent recipientEmail: " + recipientEmail);
    }

    @Override
    public boolean isAvailable() {
        // Check if the email service is available
        return true; // Replace with actual availability check
    }
}
