package com.example.day0409.orderSystem;

abstract public class Order {
    abstract public void prepareFood();
    abstract public void serveFood();
    final void completeOrder() {
        prepareFood();
        serveFood();
        System.out.println("주문이 완료되었습니다.");
    }
}
