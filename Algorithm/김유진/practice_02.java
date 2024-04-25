package day0425;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 주어진 문자열 리스트에서 길이가 5 이상인 문자열만을 선택하여 대문자로 변환하고, 그결과를 리스트로 반환
public class practice_02 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        List<String> word = words.stream().filter(n -> n.length() >= 5).map(x -> x.toUpperCase()).collect(Collectors.toList());
        word.forEach(System.out::println);
    }
}
