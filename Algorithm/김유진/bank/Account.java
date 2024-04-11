package bank;
//잔액 부족 예외 -> 출금 금액이 잔액을 초과할때 발생
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message) {
        super(message);
    }
}
//통장 미존재 예외 -> 요청한 계좌 번호의 통장이 존재하지 않을때 발생
class AccountNotFoundException extends Exception{
    public AccountNotFoundException(String message) {
        super(message);
    }
}
public class Account {
    private String AccountNum; // 계좌 번호
    private String name; //예금주 이름
    private int balance; //잔액

    public void setAccountNum(String accountNum) {
        AccountNum = accountNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNum() {
        return AccountNum;
    }

    // 입금, 계좌번호 없을시 예외 발생
    public void deposit(String account, int money)throws AccountNotFoundException{
        if(!getAccountNum().equals(account)){
            throw new AccountNotFoundException("해당 계좌는 없는 계좌입니다.");
        }
        balance +=money;
        setBalance(balance);
        System.out.println("고객님 계좌의 잔액은 " + getBalance() +"원 입니다");
    }

    // 출금, 잔액 부족시 예외 발생
    public void withdraw(int money)throws InsufficientFundsException, AccountNotFoundException{
        if(getBalance()<money){
            throw new InsufficientFundsException("잔액이 부족합니다.");
        }
        System.out.println("현재 남아있는 계좌의 잔액은 " + getBalance() +"원 입니다.");
        balance -=money;
        setBalance(balance);
        System.out.println("고객님 계좌의 잔액은 " + getBalance() +"원 입니다.");
    }

}
