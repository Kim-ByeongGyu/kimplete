package exam;

public class CashPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("현금 계산 도와드리겠습니다.\n 감사합니다.");
    }
}
