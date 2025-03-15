package com.codewithmosh.store;

import org.springframework.stereotype.Service;

@Service("SMS")
public class SMSNotificationService implements NotificationService {
    @Override
    public void SendMessage (String message, String recipientEmail) {
        System.out.println("Sent successful !!!!");
        System.out.println("SMS Sent Message: " + message);
    }
    @Override
    public boolean isAvailable() {
        // Check if the email service is available
        return true; // Replace with actual availability check
    }
}
