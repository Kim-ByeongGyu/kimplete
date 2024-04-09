package example.practice.day0409.orderexam;

public class OrderDemo {
    public static void main(String[] args) {
        Order pizza = new PizzaOrder();
        pizza.completeOrder();
        Payment creditPayment = new CreditPayment();
        creditPayment.processPayment();

        Order burger = new BurgerOrder();
        burger.completeOrder();
        Payment cashPayment = new CashPayment();
        cashPayment.processPayment();
    }
}
