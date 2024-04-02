import java.util.Arrays;
import java.util.Scanner;

/*https://www.acmicpc.net/problem/2535
 참여국 학생번호 점수 순으로 입력
 각 메달당 1개, 각 나라당 최대 2개만 수령 가능*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //총 대회 참가 학생수
        int count = 0; // 각 나라당 메달은 최대 2개만 수령가능, 이를 확인 용도

        //행 : N명의 학생  | 열 : 참여국, 학생 번호 ,점수 =>3개의 열
        int[][] student = new int[N][3]; //참여 학생을 담는 배열
        int[][] winner = new int[3][2]; // 금은동 수상자 담는 배열(국가, 학생번호만 담는열)

        //입력값 받기
        for (int i = 0; i < N; i++) {
            int contry = sc.nextInt(); // 참여국
            int number = sc.nextInt(); // 학생 번호
            int score = sc.nextInt(); // 점수
            student[i] = new int[]{contry, number, score};// i번 학생 정보 초기화
        }

        // 2차원 배열의 3번째 요소 점수를 기준으로 내림차순 정렬 <= 람다식 이용
        // a와 b는 비교될 두 요소로, a[2]와 b[2]는 세번째 요소를 의미
        Arrays.sort(student, (a, b) -> Integer.compare(b[2], a[2]));


        // 각 나라당 메달은 최대 2개만 수령가능을 생각해야함.
        winner[0] = new int[]{student[0][0], student[0][1]}; // 금메달
        winner[1] = new int[]{student[1][0], student[1][1]}; // 은메달

        if (student[0][0] == student[1][0]) {// 만약 앞에 넣은 금메달 은매달 수상자가 같은 국가라면
            count = 2;
        }
        // 각 나라당 최대 2개만 수령가능한것에 유의하여 winner 배열에 넣기
        for (int i = 2; i < N; i++) {
            if ((student[1][0] == student[i][0]) && count == 2) {
                continue;
            } else {
                winner[2] = new int[]{student[i][0], student[i][1]};
                break;
            }
        }
        //수상자 출력
        for (int[] temp : winner) {
            for (int result : temp) {
                System.out.print(result + " ");
            }
            System.out.println();
        }

    }

}
