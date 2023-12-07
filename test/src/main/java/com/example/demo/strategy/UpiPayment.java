package com.example.demo.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class UpiPayment implements PaymentMethod {


    @Override
    public double calculateProcessingFee(double amount) {
        System.out.println("Processing UPI fees");

        return 0;
    }
}
