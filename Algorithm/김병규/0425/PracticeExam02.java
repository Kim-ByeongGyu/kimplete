package com.example.day0425;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeExam02 {
    public static void main(String[] args) {
        // 실습 문제 2: 문자열 리스트 필터링
        // 주어진 문자열 리스트에서 길이가 5 이상인 문자열만을 선택하여 대문자로 변환하고, 결과를 리스트로 반환하시오.
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        List<String> result = words.stream()
                .filter(word -> word.length() >= 5)
                .map(word -> word.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
