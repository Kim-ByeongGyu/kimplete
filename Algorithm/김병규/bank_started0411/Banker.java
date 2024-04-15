package com.example.bankSystem;

import java.util.ArrayList;
import java.util.List;

public class Banker {
    String name;
    String bankerId;

//    public Banker(String name, String bankerId) {
//        this.name = name;
//        this.bankerId = bankerId;
//    }

    public void 개설승인(Bank bank, Object[] newAccount) {
        bank.addAccount(newAccount);
    }

    public static void main(String[] args) {

    }
}
