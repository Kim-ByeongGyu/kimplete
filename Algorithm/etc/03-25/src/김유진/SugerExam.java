package practice_0325;
import java.util.Scanner;
//https://www.acmicpc.net/problem/2839
public class SugerExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int answer = Count(N);
        System.out.println(answer);
    }

    // 최소 봉지 개수 계산하는 함수
    public static int Count(int N) {
        // 5kg으로 모두 채운뒤 3kg로 채우기
        for (int x5 = N / 5; x5 >= 0; x5--) {
            int temp = N - (x5 * 5);
            if (temp % 3 == 0) {
                return x5 + (temp / 3);
            }
        }

        return -1;
    }
}
