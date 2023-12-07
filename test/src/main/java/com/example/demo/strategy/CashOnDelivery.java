package com.example.demo.strategy;

public class CashOnDelivery implements PaymentMethod{
    @Override
    public double calculateProcessingFee(double amount) {
        return 0;
    }
}
