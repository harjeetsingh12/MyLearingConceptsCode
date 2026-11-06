package com.harjeet.suawala.modelIntroduction.impl;

import com.harjeet.suawala.modelIntroduction.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(name = "notification.type", havingValue = "email") // when you want to define based on the condition from app properties.file
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email message....! "+message);
    }
}
