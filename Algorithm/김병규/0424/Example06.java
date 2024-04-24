package com.example.day0424;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example06 {
    public static void main(String[] args) {
        // 모든 요소에 대해 조건 확인하기
        // 주어진 List<Integer>의 모든 요소가 짝수인지 확인하라.
        // 람다식을 활용하여 조건 검사를 수행하고 결과를 출력하라.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Predicate<Integer> isEven = n -> n % 2 == 0;

        list.forEach(n -> System.out.print(isEven.test(n) + " "));
        System.out.println();
        System.out.print("짝수 : ");
        for (int n : list) {
            if (isEven.test(n)) {
                System.out.print(n + " ");
            }
        }

    }
}
