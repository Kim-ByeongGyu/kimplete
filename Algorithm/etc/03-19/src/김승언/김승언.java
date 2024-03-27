package ch02;

import java.util.Scanner;

public class 김승언 {
    // https://www.acmicpc.net/problem/25304 (문제)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 영수증에 적힌 총 금액 입력
        System.out.println("영수증에 적힌 총 금액을 입력하세요: ");
        int totalPrice = scanner.nextInt();

        // 영수증에 적힌 물건의 종류 수 입력
        System.out.println("영수증에 적힌 구매한 물건의 종류 수를 입력하세요: ");
        int numOfItems = scanner.nextInt();

        // 총 금액을 계산할 변수 초기화
        int total = 0;

        // 각 물건의 가격과 개수를 입력받아 총 금액 계산
        for (int i = 0; i < numOfItems; i++) {
            System.out.println("물건 " + (i + 1) + "의 가격과 개수를 입력하세요: ");
            int price = scanner.nextInt();
            int quantity = scanner.nextInt();
            total += price * quantity;
        }

        // 결과 출력
        if (totalPrice == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
