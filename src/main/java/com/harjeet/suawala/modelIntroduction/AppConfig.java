package com.harjeet.suawala.modelIntroduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype") //bean scope as prototype and by defaults singleton
    PaymentService paymentService(){
        return new PaymentService();
    }
}
