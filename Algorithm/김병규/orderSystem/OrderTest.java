package com.example.day0409.orderSystem;

public class OrderTest {
    public static void main(String[] args) {
        System.out.println("-----burger-----");
        Order burger = new BurgerOrder();
        burger.completeOrder();
        Payment creditcard = new CreditPayment();
        creditcard.processPayment();

        System.out.println("-----pizza-----");
        Order pizza = new PizzaOrder();
        pizza.completeOrder();
        Payment cash = new CashPayment();
        cash.processPayment();
    }
}
