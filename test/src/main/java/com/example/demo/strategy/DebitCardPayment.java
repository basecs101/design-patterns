package com.example.demo.strategy;


import org.springframework.stereotype.Component;

@Component
    class DebitCardPayment implements PaymentMethod {
        @Override
        public double calculateProcessingFee(double amount) {
            return amount * 0.02;
        }
    }

