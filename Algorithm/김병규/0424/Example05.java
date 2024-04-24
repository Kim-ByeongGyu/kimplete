package com.example.day0424;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example05 {
    public static void main(String[] args) {
        // 요소 변환하기
        // 주어진 List<Integer>의 각 요소를 제곱한 결과를 새 리스트에 저장하고 출력하라.
        // for 루프와 람다식을 활용하여 각 요소를 변환하라.
        List<Integer> list = Arrays.asList(1, 5, 7, 89 , 3 , 4, 5 , 8 , 725);
        List<Integer> newList = new ArrayList<>();

        list.forEach(a -> newList.add(a * a));
        System.out.println(newList);
    }
}
