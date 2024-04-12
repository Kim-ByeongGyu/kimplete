import java.util.Arrays;
//https://school.programmers.co.kr/learn/courses/30/lessons/1845
class Solution {
    public int solution(int[] nums) {
        // 배열을 정렬
        Arrays.sort(nums);
        
        int prev = -1;
        int count = 0;
        
        // 중복을 제거하고, 중복을 제거한 폰켓몬 종류의 수
        for (int num : nums) {
            // 이전 폰켓몬과 같지 않은 경우에만 count를 증가
            if (num != prev) {
                count++;
                // 이전 폰켓몬 번호를 현재 번호로 갱신
                prev = num;
            }
        }
        
        // 중복을 제거한 폰켓몬 종류의 수와 N/2 중 작은 값을 반환합니다.
        return Math.min(count, nums.length / 2);
    }
}