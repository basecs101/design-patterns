package com.example.demo.strategy;


import org.springframework.stereotype.Component;

@Component
    class NetBankingPayment implements PaymentMethod {
        @Override
        public double calculateProcessingFee(double amount) {
            return amount * 0.005;
        }
    }

