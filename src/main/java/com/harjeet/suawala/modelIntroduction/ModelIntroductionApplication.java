package com.harjeet.suawala.modelIntroduction;

import com.harjeet.suawala.modelIntroduction.impl.SmsNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@SpringBootApplication
public class ModelIntroductionApplication implements CommandLineRunner {
    @Autowired
    PaymentService paymentService1;
    @Autowired
    PaymentService paymentService2;
   // @Autowired // Autowired Dependency injection
//    final NotificationService notificationService;  //Dependency Injection (DI)
//
//   public ModelIntroductionApplication(NotificationService notificationService) {
//		this.notificationService =notificationService;  //Injection Field using Constructor
//    }

   // @Autowired(required = false) // if you don't want any dependecies created
    @Autowired
    Map<String, NotificationService> notificationServiceMaps = new HashMap<>(); //if want all serivces are required


    public static void main(String[] args) {
        SpringApplication.run(ModelIntroductionApplication.class, args);
        //creating object of he PaymentService class
        //PaymentService paymentService = new PaymentService();
        //dependecy injection by spring

//		paymentService.pay();

    }

    @Override
    public void run(String... args) throws Exception {
        //NotificationService notificationService = new SmsNotificationService();
        System.out.println(paymentService1.hashCode());
        System.out.println(paymentService2.hashCode());
        paymentService1.pay();
        paymentService2.pay();
       // notificationService.send("Hello");
		//this.notificationService =null; // can't we assign as null or change the value

        for(var notificationServiceMap: notificationServiceMaps.entrySet()){
            System.out.println(notificationServiceMap.getKey());
            notificationServiceMap.getValue().send("Hello");
        }
    }
}
