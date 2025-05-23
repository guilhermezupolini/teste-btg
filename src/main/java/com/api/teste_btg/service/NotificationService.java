package com.api.teste_btg.service;

import com.api.teste_btg.client.NotificationClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private NotificationClient notificationClient;

    public String sendNotification() {
        return notificationClient.sendNotification();
    }
}
