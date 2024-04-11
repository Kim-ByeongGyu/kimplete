package example.practice.day0411.BankExam;

public class Account {
    private int accountNum;
    private String accountUser;
    private int accountMoney = 0;

    Account(int num, String name, int money){
        accountNum = num;
        accountUser = name;
        accountMoney = money;
    }

    void inputMoney(int money){
        accountMoney += money;
        System.out.println(money + "원 입금이 처리되었습니다.");
        System.out.println("현재 잔액: "+ accountMoney);
    }
    void takeoutMoney (int money) throws InsufficientFundsException{
        try{
            if(accountMoney < money){
                throw new InsufficientFundsException();
            }
            accountMoney -= money;
            System.out.println(money + "원 출금이 처리되었습니다.");
            System.out.println("현재 잔액: "+ accountMoney);
        }catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }
}
