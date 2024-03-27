package algoritm;

import java.util.Arrays;
import java.util.Stack;

public class ExamLv1_03 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12906
    public static int[] solution(int []arr) {
        int[] answer = {};

        Stack<Integer> stack = new Stack<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                stack.push(arr[i]);
            } else if (arr[i] != stack.peek()) {
                stack.push(arr[i]);
            }
        }
        answer = new int[stack.size()];
        for (int i = answer.length -1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;

    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,3,3,0,1,1};
        int[] arr2 = {4, 4, 4, 3, 3};

        System.out.println(Arrays.toString(solution(arr1)));
        System.out.println(Arrays.toString(solution(arr2)));
    }
}
