package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SendNotification {

    private final NotificationService emailNotificationService;
    private final NotificationService smsNotificationService;

    @Autowired
    public SendNotification(@Qualifier("EMAIL") NotificationService emailNotificationService,
                            @Qualifier("SMS") NotificationService smsNotificationService) {
        this.emailNotificationService = emailNotificationService;
        this.smsNotificationService = smsNotificationService;
    }

    public void UserSendNotification(String message) {
//        if (emailNotificationService.isAvailable()) {
//            emailNotificationService.SendMessage(message);
//        } else if (smsNotificationService.isAvailable()) {
//            smsNotificationService.SendMessage(message);
//        } else {
//            throw new IllegalStateException("No notification service is available");
//        }

//        if (emailNotificationService.isAvailable()) {
//            emailNotificationService.SendMessage(message,"adas");
//        } else {
//            smsNotificationService.SendMessage(message,"asdsad");
//        }
    }
}

