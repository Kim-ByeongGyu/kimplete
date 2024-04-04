package dailyAlgorithm.Solution;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class day0404 {
    // https://www.acmicpc.net/problem/14425
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // S의 문자열 개수 N
        int M = sc.nextInt(); // 검사할 문자열 개수 M
        sc.nextLine();


        // 집합 S에 문자열 입력받고 저장
        Set<String> S = new HashSet<>();

        for (int i=0; i<N; i++){
            S.add(sc.nextLine());
        }


        // M 검사하면서 S에 포함된 개수 카운트
        int cnt = 0;
        for (int i=0; i<M; i++) {
            String str = sc.nextLine();
            if (S.contains(str)) {
                cnt++;
            }
        }

        System.out.println(cnt);

        sc.close();

    }
}
