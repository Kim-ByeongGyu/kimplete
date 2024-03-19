//https://school.programmers.co.kr/learn/courses/30/lessons/12910
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count = 0; //나누어지는 원소 개수
        
        // 원소 찾기
        StringBuffer result = new StringBuffer();
        for(int i =0; i<arr.length; i++){
            if((int)arr[i] % divisor ==0){
                count++;
                result.append(arr[i]);
                result.append(",");
            }
        }
        answer = new int[count];
        System.out.println(result.length());
        //여기까진 정답
        int x = 0; //배열 카운트
        while(true){
            if(x==3){
                break;
            }
               for(int i = 0; i<result.length(); i++){
                   if(result.charAt(i) != ','){
                       answer[x] = (int)result.charAt(i);
                       x++;
                   }
       }
        }
     
        //정렬
       
        
        //나누어 떨어지는 원소가 없으면 -1리턴
        if(count == 0){
            answer = new int[]{-1};
        }
        
        return answer;
    }
}