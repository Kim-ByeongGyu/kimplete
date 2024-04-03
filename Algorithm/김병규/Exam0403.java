package algoritm;


public class ExamLv2_04 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12924
    static int solution(int n) {
        int answer = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {          // 시작 자연수를 1부터 n까지 반복합니다.
            for (int j = i; j <= n; j++) {      // 시작 자연수부터 n까지의 합을 계산합니다.
                sum += j;
                if (sum == n) {                 // 만약 합이 n과 같다면,
                    answer++;                   // 가능한 표현의 수를 증가
                    sum = 0;
                    break;
                } else if (sum > n) {           // 만약 합이 n을 초과한다면, 종료
                    sum = 0;
                    break;
                }
            }
        }

//        int start = 1;
//
//        for (int i = 0; i <= n; i++) {
//            sum += i;
//            // 순서 조심하기
//            while (sum > n) {
//                sum -= start;
//                start++;
//            }
//            if (sum == n) {
//                answer++;
//            }
//        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));   // 4
        System.out.println(solution(100));  // 3
        System.out.println(solution(55));   // 4
    }
}
