package com.example.day0424;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example04 {
    public static void main(String[] args) {
        // 조건에 맞는 요소 찾기
        // 주어진 List<String>에서 글자 수가 5 이상인 첫 번째 단어를 찾아 출력하라.
        // for 루프와 람다식을 활용하여 조건에 맞는 요소를 찾아보세요.
        List<String> list = Arrays.asList("hi", "java", "qwerty", "world", "today", "all");

        Predicate<String> func = x -> x.length() >= 5;

        for(String str : list) {
            if (func.test(str)) {
                System.out.println(str);
                break;
            }
        }
    }
}
