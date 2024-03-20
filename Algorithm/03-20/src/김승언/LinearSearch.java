package ch02;

import java.util.Scanner;

public class LinearSearch {
    // 보초법을 사용하여 배열의 최댓값 찾기

    public static int findMaxWithSentinel(int[] arr) {
        int n = arr.length;
        int max = arr[0];


        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 배열 크기 입력
        System.out.print("배열의 크기를 입력하세요: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // 배열 요소 입력
        System.out.println("배열의 요소를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 최대값 찾기
        int max = findMaxWithSentinel(arr);

        // 결과 출력
        System.out.println("배열에서 가장 큰 값은 " + max + "입니다.");
    }
}