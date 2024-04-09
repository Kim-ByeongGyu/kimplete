package com.example.day0409.orderSystem;

public class BurgerOrder extends Order{
    @Override
    public void prepareFood() {
        System.out.println("햄버거를 준비합니다.");
    }

    @Override
    public void serveFood() {
        System.out.println("햄버거를 서빙합니다.");
    }
}
