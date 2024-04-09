package example.practice.day0409.orderexam;

public class CreditPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("카드 결제");
    }
}
