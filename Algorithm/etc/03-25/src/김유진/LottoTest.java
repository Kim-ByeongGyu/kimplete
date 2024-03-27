package com.example.main;
import com.example.util.Lotto;
import java.util.Scanner;

public class LottoTest {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        Scanner sc = new Scanner(System.in);

        System.out.println("몇번을 섞을까요?");
        lotto.mix(sc.nextInt());
        lotto.ballPick();
    }
}
