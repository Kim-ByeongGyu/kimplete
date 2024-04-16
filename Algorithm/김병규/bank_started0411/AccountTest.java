package com.example.bankSystem;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 0;

        System.out.print("계좌 소유주명 : ");
        String name = sc.next();
        System.out.print("계좌번호 : ");
        int accountNumber = sc.nextInt();

        Account account = new Account(name, accountNumber);
        int num;
        do {
            System.out.println("1. 입금    2. 출금    3. 잔액확인    4.종료");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.print("입금하실 금액 :: ");
                    money = sc.nextInt();
                    account.입금(money);
                    break;
                case 2:
                    System.out.print("출금하실 금액 :: ");
                    money = sc.nextInt();
                    try {
                        account.출금(money);
                    } catch (AccountCustomException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("잔액 ::: "+account.getBalance());

            }
        } while (num < 4);
    }
}
