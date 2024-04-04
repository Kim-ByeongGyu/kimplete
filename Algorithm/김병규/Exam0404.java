package algoritm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ExamLv2_05 {
    public static int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> answerList = new ArrayList<>();

        // 각 기능의 진도를 스택에 저장
        for (int i = progresses.length - 1; i >= 0; i--) {
            int remain = 100 - progresses[i];
            int days = remain / speeds[i];
            if (remain % speeds[i] != 0) { // 나머지가 있는 경우에만 하루를 추가
                days++;
            }
            stack.push(days);
        }

        while (!stack.isEmpty()) {
            int count = 1;
            int top = stack.pop();

            // 스택의 top과 다음 기능들의 진도를 비교하여 배포 가능한 기능 수 계산
            while (!stack.isEmpty() && top >= stack.peek()) {
                stack.pop();
                count++;
            }
            answerList.add(count);
        }

        // List를 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }


    public static void main(String[] args) {
        int[] progresses1 = {93, 30, 55};
        int[] speeds1 = {1,30,5};
        System.out.println(Arrays.toString(solution(progresses1, speeds1)));

        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(solution(progresses2, speeds2)));
    }
}
