package bank;
import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        Bank bank = new Bank(""); // 은행
        Account account = new Account(); // 통장
        Banker banker = new Banker(); // 은행원
        int temp;
        String name, ac;
        System.out.println("어서오세요~'돈돈돈!' 은행에 오신걸 환영합니다.");
        System.out.println("예금주 이름을 입력하세요");
        name = sc.nextLine();
        account.setName(name);

        while(true){
            System.out.println("원하시는 메뉴를 입력해주세요");
            System.out.print("(1.잔액조회\t2.입급\t3.출금\t4.종료) >>");
            temp = sc.nextInt();
            sc.nextLine(); // 개행문자 입력버퍼 비우기
            System.out.println("계좌 번호를 입력하세요.");
            ac = sc.nextLine();
            account.setAccountNum(ac);
            if(temp ==4) {
                System.out.println("안녕히가세요.");
                break;
            }
            switch(temp){
                case 1:
                    System.out.println("고객님 계좌에 남아있는 잔액은 " + account.getBalance() + " 원 입니다.");
                    break;
                case 2:
                    System.out.println("입금을 도와드리겠습니다. 원하시는 금액을 입력해주세요 >> ");
                    try{
                        account.deposit(ac,sc.nextInt());
                    }catch (AccountNotFoundException e){
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("출금을 도와드리겠습니다. 원하시는 금액을 입력해주세요 >> ");
                    try{
                        account.withdraw(sc.nextInt());
                    }catch(AccountNotFoundException e){
                        e.printStackTrace();
                    }
                    catch(InsufficientFundsException e){
                        e.printStackTrace();
                    }
                    break;

            }
            System.out.println();
        }

    }
}
