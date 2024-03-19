package algoritm;

public class ExamLv2_01 {
//  https://school.programmers.co.kr/learn/courses/30/lessons/12939
    public String solution(String s) {
        String[] result = s.split(" ");

        int[] arr = new int[result.length];
        for (int i = 0; i < result.length; i++){
            arr[i] = Integer.parseInt(result[i]);
        }

        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max <= arr[i]) max=arr[i];
            if (min >= arr[i]) min=arr[i];
        }

        String answer = min+" "+max;
        return answer;
    }
}
