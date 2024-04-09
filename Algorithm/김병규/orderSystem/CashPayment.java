package com.example.day0409.orderSystem;

public class CashPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("현금으로 결제합니다.");
    }
}
