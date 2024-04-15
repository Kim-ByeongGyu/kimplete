package com.example.day08;

import java.util.ArrayList;
import java.util.List;


// 통장 미존재 예외 클래스
class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}

// 잔액 부족 예외 클래스
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// 통장 클래스
class Account {
    private String accountNumber; // 계좌번호
    private String accountHolder;  // 예금주 이름
    private double balance;  //잔액

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {  // 입금
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {  // 출금
        if (amount > balance) {
            // 출금 금액이 잔액을 초과할 경우 InsufficientFundsException 던짐
            throw new InsufficientFundsException("잔액이 부족합니다.");
        }
        balance -= amount;
    }
}

// 은행 클래스
class Bank {
    private String name;  // 은행이름
    private List<Account> accounts;  // 통장 목록

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // 통장 개설. 입력받아 새로운 Account 객체 생성, 통장 목록에 추가
    public void newAccount(String accountNumber, String accountHolder, double initialDeposit) {
        Account account = new Account(accountNumber, accountHolder, initialDeposit);
        accounts.add(account);
    }

    // 특정 계좌 번호를 받아서 해당하는 통장 반환
    public Account findAccount(String accountNumber) throws AccountNotFoundException {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        // 계좌번호에 해당하는 통장이 없을 경우 AccountNotFoundException 던짐
        throw new AccountNotFoundException("통장을 찾을 수 없습니다.");
    }
}

// 은행원 클래스
class Banker {
    private String name;  // 이름
    private String bankerID;  // 은행원 ID

    public Banker(String name, String bankerID) {
        this.name = name;
        this.bankerID = bankerID;
    }

    // 통장개설 승인
    public void approveNewAccount(Bank bank, String accountNumber, String accountHolder, double initialDeposit) {
        bank.newAccount(accountNumber, accountHolder, initialDeposit);
        System.out.println("통장 개설이 승인되었습니다.");
    }

    // 출금 승인, 잔액 부족시 InsufficientFundsException
    public void approveWithdrawal(Account account, double amount) throws InsufficientFundsException {
        account.withdraw(amount);
        System.out.println("출금이 승인되었습니다.");
    }
}