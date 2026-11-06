package com.harjeet.suawala.modelIntroduction.impl;

import com.harjeet.suawala.modelIntroduction.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //we have multiple services class i want to call this particular class
//@ConditionalOnProperty(name = "notification.type", havingValue = "sms")
public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sms message....! "+message);
    }
}
