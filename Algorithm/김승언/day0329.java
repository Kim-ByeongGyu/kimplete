package dailyAlgorithm;

import java.util.Stack;

public class day0329 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12973
    public int solution(String s) {

        int answer = 0;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }


        if (stack.isEmpty()) {
            answer = 1;
        }

        return answer;
    }
}

//    return stack.isEmpty() ? 1 : 0;

