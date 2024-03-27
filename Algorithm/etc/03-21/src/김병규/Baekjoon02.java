package algoritm;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon02 {
    // https://www.acmicpc.net/problem/2750

    static void bSort (int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열 크기 : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 요소 입력
        for (int i = 0; i < n; i++) {
            System.out.printf("요소 %d : ", i+1);
            arr[i] = sc.nextInt();
        }
        bSort(arr);

        for (int i = 0;i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
