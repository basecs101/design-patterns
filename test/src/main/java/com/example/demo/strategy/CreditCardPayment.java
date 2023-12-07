package com.example.demo.strategy;


import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment implements PaymentMethod {
    @Override
    public double calculateProcessingFee(double amount) {
        return amount * 0.01;
    }
}
