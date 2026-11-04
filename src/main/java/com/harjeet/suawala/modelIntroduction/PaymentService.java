package com.harjeet.suawala.modelIntroduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//creating the bean and object bu spring framwork/IOC container/ spring context
//@Component
//@Service
//@Repository
//@Controller
public class PaymentService {
    public void pay(){
        System.out.println("paying....");
    }
    //before bean creation
    @PostConstruct
    public void beanInitialize(){
        System.out.println("Before Bean creation");
    }

    //before destroy the bean
    @PreDestroy
    public void beanDestoy(){
        System.out.println("Payment is Done");
    }
}
