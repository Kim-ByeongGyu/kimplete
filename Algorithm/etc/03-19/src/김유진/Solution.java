//https://school.programmers.co.kr/learn/courses/30/lessons/12910
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count = 0; //나누어지는 원소 개수
        
        // 원소 찾기
        String result = "";
        for(int i =0; i<arr.length; i++){
            if((int)arr[i] % divisor ==0){
                count++;
                result +=arr[i];
                result += ",";
            }
        }
        answer = new int[count];
        String[] result2 = result.split(","); //,을 기준으로 배열 반환
        
        for(int i=0; i<count; i++){
           answer[i] = Integer.parseInt(result2[i]); // String 배열 -> int배열 전환
        }
       Arrays.sort(answer); // 정렬
        //나누어 떨어지는 원소가 없으면 -1리턴
        if(count == 0){
            answer = new int[]{-1};
        }
        
        return answer;
    }
}