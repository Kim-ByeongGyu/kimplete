package dailyAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class day0327 {
    // 백준 커트라인(25305) https://www.acmicpc.net/problem/25305
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 응시자 수 N과 상을 받는 사람의 수 k
        System.out.println("응시자 수와 상을 받는 사람의 수를 입력하세요 : ");
        int N = sc.nextInt();
        int k = sc.nextInt();

        // 학생들 점수 입력 받고 배열에 저장
        int[] scores = new int[N];
        System.out.println("각 학생의 점수를 입력하세요 : ");
        for (int i=0; i<N; i++){
            scores[i] = sc.nextInt();
        }

        // 내림차순 정렬
        Arrays.sort(scores);
        // 커트라인
        int cutoffPoint = scores[N-k];

        System.out.println("커트라인 점수는 "+cutoffPoint+"점 입니다.");

        sc.close();


    }
}
