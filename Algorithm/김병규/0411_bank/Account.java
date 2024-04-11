package com.example.bankSystem;

import java.util.Scanner;

public class Account {
    private int accountNumber;
    private String name;
    private int balance = 0;

    public Account(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }


    public void 입금(int money) {
        balance = balance + money;
        System.out.println(money + "원 입금하셨습니다.");
        System.out.printf("잔액 ::: %d\n", balance);
    }
    public void 출금(int money) throws AccountCustomException {
            if (balance < money) {
                throw new AccountCustomException("잔액이 부족합니다.");
            }
        balance = balance - money;
            System.out.println(money + "원 출금하셨습니다.");
        System.out.printf("잔액 ::: %d\n", balance);

    }


}
