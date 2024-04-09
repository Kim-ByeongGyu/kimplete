package exam;

public class CreditPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("카드 계산 도와드리겠습니다.\n감사합니다♥");
    }
}
