package com.example.day0325;

import java.util.Scanner;

public class LottoTest {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        Scanner sc = new Scanner(System.in);
        System.out.println("몇개의 공울 추첨하실건가요?");
        int n = sc.nextInt();
        lotto.set();
        lotto.mix(n);
    }
}
