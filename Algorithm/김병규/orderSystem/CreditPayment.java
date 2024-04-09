package com.example.day0409.orderSystem;

public class CreditPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("신용카드로 결제합니다.");
    }
}
