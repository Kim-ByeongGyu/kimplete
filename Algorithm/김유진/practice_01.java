package day0425;

import java.util.Arrays;

// 주어진 정수 배열에서 짝수만을 찾아 그 합을 구하라
public class practice_01 {
    public static void main(String[] args) {
        int[] numbers = {3, 10, 4, 17, 6};

        int result = Arrays.stream(numbers).filter(n -> n % 2 == 0 ).sum();
        System.out.println(result);
    }
}
