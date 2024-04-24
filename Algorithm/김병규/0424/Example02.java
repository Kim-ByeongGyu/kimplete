package com.example.day0424;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Example02 {
    public static void main(String[] args) {
        // 최대값 찾기
        // 주어진 정수 배열에서 최대값을 찾아 출력하라.
        // 람다식을 사용하여 자바의 Comparator 인터페이스와 함께 Arrays.sort()를 활용하라.
        List<Integer> list = Arrays.asList(5, 1, 74, 8, 69, 2, 5, 56, 9, 47);
        Comparator<Integer> comparator = (a, b) -> b - a;
        list.sort(comparator);
        System.out.println(list.get(0));
    }
}
