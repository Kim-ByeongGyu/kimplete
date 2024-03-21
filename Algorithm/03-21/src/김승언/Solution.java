package ch03;
import java.util.*;

class Solution {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=java
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();


        for (int i = progresses.length - 1; i >= 0; i--) {
            int remainProgress = 100 - progresses[i]; // 남은 진도
            int day = remainProgress / speeds[i]; // 배포까지 걸리는 일수
            if (remainProgress % speeds[i] != 0) { // 나머지가 있는 경우 하루 더 추가
                day++;
            }
            stack.push(day);
        }
        List<Integer> answerList = new ArrayList<>();

        
        while (!stack.isEmpty()) {
            int day = stack.pop();
            int cnt = 1; // 배포되는 기능의 수


            while (!stack.isEmpty() && stack.peek() <= day) {
                stack.pop();
                cnt++;
            }

            answerList.add(cnt);
        }

        // 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}



