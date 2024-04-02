package algoritm;

public class ExamLv2_04 {
        // https://school.programmers.co.kr/learn/courses/30/lessons/12911
        static public int solution(int n) {
            int answer = n+1;
            int count = countOne(n);


            while (countOne(answer) != count) {
                answer++;
            }
            return answer;
        }
        // 이진수에서 1의 갯수
        static int countOne(int num) {
            // 이진수로 변환
            String binary = Integer.toBinaryString(num);
            // 이진수에서 1위 갯수 카운팅
            // 이진수의 1을 ""으로 바꿔서 1을 없앤 후 그 길이를 이진수 길이에서 뺸다.
            // replace >> target을 replacement로 대체하는 함수
            int count = binary.length() - binary.replace("1", "").length();

            return count;
        }

    public static void main(String[] args) {
        int n1 = 78;
        int n2 = 15;

        System.out.println(solution(n1));
        System.out.println(solution(n2));
    }
}
