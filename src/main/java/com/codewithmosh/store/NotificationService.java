package com.codewithmosh.store;

public interface NotificationService {
    void SendMessage(String message, String recipientEmail);
    boolean isAvailable();
}
