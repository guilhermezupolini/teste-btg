package com.api.teste_btg.client;

import org.springframework.stereotype.Component;

@Component
public class NotificationClient {

    public void sendNotification() {
        System.out.println("Notificacao enviada");
    }
}
