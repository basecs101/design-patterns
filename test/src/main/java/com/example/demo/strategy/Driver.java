package com.example.demo.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Slf4j
@Service

public class Driver implements InitializingBean {
    PaymentService paymentService;

    public Driver(PaymentService paymentService) {
        this.paymentService = paymentService;
    }




    @Override
    public void afterPropertiesSet() throws Exception {
        paymentService.processPayment(1000,"UPI");
    }
}
