package com.example.day0425;

import java.util.Arrays;

public class PracticeExam01 {
    public static void main(String[] args) {
        // 실습 문제 1: 숫자 배열 처리
        // 주어진 정수 배열에서 짝수만을 찾아 그 합을 구하시오.
        int[] numbers = {3, 10, 4, 17, 6};
        int sum = Arrays.stream(numbers).filter(n -> n %2 == 0).sum();
        System.out.println(sum);
    }
}
