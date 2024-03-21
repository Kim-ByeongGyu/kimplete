package algoritm;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon02 {
    // https://www.acmicpc.net/problem/2750
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열 크기 : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // 요소 입력
        for(int i=0;i<n;i++){
            System.out.printf("요소 %d : ", i+1);
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
