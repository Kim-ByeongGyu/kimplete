package com.example.bankSystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    String name;
    List<Object[]> accountList = new ArrayList<Object[]>();
    Object[] accountExam01 = {"사람01", 12345789, 1234};
    Object[] accountExam02 = {"사람02", 12345788, 0070};

    public Bank(String name) {
        this.name = name;
        accountList.add(accountExam01);
        accountList.add(accountExam02);
    }

    public void addAccount(String name, int accountNumber, int password) {
        Object[] temp = {name, accountNumber, password};
        accountList.add(temp);
    }

    public void searchAccount(int accountNumber) {
        for (Object[] account:accountList) {
            if (account.length > 1 && account[1] instanceof Integer) {
                if ((Integer) account[1] == accountNumber) {
                    System.out.println("계좌주 : " + account[0]);
                    System.out.println("계좌번호 : " + accountNumber);
                    return; // 계좌를 찾은 후 메서드 종료
                }
            }
        }
        System.out.println("계좌번호 " + accountNumber + "에 해당하는 사용자를 찾지 못했습니다.");
    }

}
