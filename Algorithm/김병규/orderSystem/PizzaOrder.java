package com.example.day0409.orderSystem;

public class PizzaOrder extends Order {
    @Override
    public void prepareFood() {
        System.out.println("피자를 준비합니다.");
    }

    @Override
    public void serveFood() {
        System.out.println("피자를 서빙합니다.");
    }
}
