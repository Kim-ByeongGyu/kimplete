package com.example.day0424;

import java.util.Arrays;
import java.util.List;

public class Example01 {
    public static void main(String[] args) {
        // 문자열 리스트 정렬하기
        // 주어진 List<String>을 문자열 길이에 따라 정렬하되,
        // 람다식을 사용하여 Collections.sort() 메서드를 활용하라.
        List<String> list = Arrays.asList("hello", "world", "java", "happy java", "all");
        list.sort((a, b) -> a.length() - b.length());
        System.out.println(list);
    }
}
