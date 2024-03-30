package algoritm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExamLv1_04 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/68644


        public static int[] solution(int[] numbers) {
            int[] answer ={};
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    int sum = numbers[i] + numbers[j];

                    // 중복 확인
                    // contain은 sum이 list에 있는지 확인하고 있다면 참을 반환
                    if (!list.contains(sum)) {
                        list.add(sum);
                    }
                }
            }

            // ArrayList를 answer배열로 변환 > 동적 배열은 컴파일 시 오류를 발생 시킨다.
            // 배열의 크기 정의
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            // 배열을 오름차순으로 정렬
            Arrays.sort(answer);

            return answer;
        }


    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};

        System.out.println(Arrays.toString(solution(numbers)));
    }
}
