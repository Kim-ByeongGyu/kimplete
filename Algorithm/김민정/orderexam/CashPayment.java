package example.practice.day0409.orderexam;

public class CashPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("현금 결제");
    }
}
