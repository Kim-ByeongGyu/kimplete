package example.practice.day0411.BankExam;

public class BankMain {
    public static void main(String[] args) {
        Account account1 = new Account(1,"k",0);
        account1.inputMoney(10000);
        account1.takeoutMoney(3000);
        account1.takeoutMoney(8000);
    }
}
