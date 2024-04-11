package example.practice.day0411.BankExam;

public class InsufficientFundsException extends RuntimeException{
    public InsufficientFundsException(){
        super("잔액이 부족합니다.");
    }
}
