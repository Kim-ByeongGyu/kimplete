//https://school.programmers.co.kr/learn/courses/30/lessons/12949
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int m = arr1.length; // arr1의 행 수
        int n = arr2[0].length; // arr2의 열 수
        int[][] answer = new int[m][n]; // 결과 행렬
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return answer;
    }
}