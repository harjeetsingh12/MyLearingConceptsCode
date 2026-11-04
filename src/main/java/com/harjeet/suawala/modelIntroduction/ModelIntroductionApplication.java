package com.harjeet.suawala.modelIntroduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModelIntroductionApplication implements CommandLineRunner {
	@Autowired
	PaymentService paymentService1;
	@Autowired
	PaymentService paymentService2;

	public static void main(String[] args) {
		SpringApplication.run(ModelIntroductionApplication.class, args);
		//creating object of he PaymentService class
		//PaymentService paymentService = new PaymentService();
		//dependecy injection by spring

//		paymentService.pay();

	}

	@Override
	public void run(String... args) throws Exception {
        // ceating bean scope as singleton most of time it is uses
		System.out.println(paymentService1.hashCode());
		System.out.println(paymentService2.hashCode());
		paymentService1.pay();
		paymentService2.pay();
	}
}
