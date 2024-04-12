package dailyAlgorithm.Solution;
import java.util.*;
public class day0412 {
    // https://www.acmicpc.net/problem/2217


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 로프 개수 입력
            int n = scanner.nextInt();

            // 각 로프의 최대 중량 입력
            int[] ropes = new int[n];
            for (int i = 0; i < n; i++) {
                ropes[i] = scanner.nextInt();
            }

            // 각 로프의 최대 중량을 내림차순으로 정렬
            Arrays.sort(ropes);

            // 최대 중량 구하기
            int maxWeight = 0;
            for (int i = n - 1; i >= 0; i--) {
                maxWeight = Math.max(maxWeight, ropes[i] * (n - i));
            }

            System.out.println(maxWeight);



            
//            int n = scanner.nextInt();
//
//            int[] ropes = new int[n];
//            for (int i = 0; i < n; i++) {
//                ropes[i] = scanner.nextInt();
//            }
//
//            int maxWeight = 0;
//            for (int i = 0; i < n; i++) {
//                maxWeight = Math.max(maxWeight, ropes[i] * (n - i));
//            }
//
//            System.out.println(maxWeight);
        }
    }


