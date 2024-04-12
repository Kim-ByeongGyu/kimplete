package algoritm;

import java.util.Arrays;
import java.util.Stack;

public class ExamLv2_06 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42584
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        // 주식 가격을 순회
        for (int i = 0; i < prices.length; i++) {
            // 스택이 비어있지 않고 현재 가격이 스택의 맨 위 인덱스에 해당하는 가격보다 낮다면
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int topIndex = stack.pop();
                // 스택에서 꺼낸 인덱스(topIndex)에 대한 주식 가격이 떨어지지 않은 기간을 계산
                answer[topIndex] = i - topIndex;
                System.out.println(Arrays.toString(answer));
            }
            // 현재 인덱스를 스택에 추가
            stack.push(i);
        }

        // 스택에 남아 있는 인덱스에 대해 가격이 떨어지지 않은 기간을 계산
        while (!stack.isEmpty()) {
            int topIndex = stack.pop();
            // 주식 가격이 끝까지 떨어지지 않은 경우 남은 기간을 계산
            answer[topIndex] = prices.length - topIndex - 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] prices = {1,2,3,2,3};

        System.out.println(Arrays.toString(solution(prices)));
    }
}
