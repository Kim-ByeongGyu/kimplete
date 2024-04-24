package com.example.day0424;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example03 {
    public static void main(String[] args) {
        // 리스트의 각 요소에 연산 적용하기
        // 주어진 List<Integer>의 각 요소에 10을 더한 결과를 새 리스트에 저장하고 출력하라.
        // 람다식을 사용하여 List의 forEach() 메서드를 활용하라.
        List<Integer> list = Arrays.asList(5,7,9,33,45,1,9,7,2,58,84);
        List<Integer> newList = new ArrayList<>();

        list.forEach(a -> newList.add(a + 10));

        System.out.println(newList);

    }
}
