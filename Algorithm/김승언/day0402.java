package dailyAlgorithm;

class day0402 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[][] board) {
                int answer = 0;
                int length = board.length;
                int[][] temp = new int[length + 2][length + 2];

                for(int i = 1; i < length + 1; i++) {
                    for(int j = 1; j < length + 1; j++) {
                        temp[i][j] = board[i - 1][j - 1];
                    }
                }

                for(int i = 1; i < length + 1; i++) {
                    for(int j = 1; j < length + 1; j++) {
                        if(temp[i][j] == 1) {
                            for(int a = i - 1; a <= i + 1; a++) {
                                for(int b = j - 1; b <= j + 1; b++) {
                                    if(temp[a][b] != 1) {
                                        temp[a][b] = 2;
                                    }
                                }
                            }
                        }
                    }
                }

                for(int i = 1; i < length + 1; i++) {
                    for(int j = 1; j < length + 1; j++) {
                        if(temp[i][j] == 0) {
                            answer++;
                        }
                    }
                }

                return answer;
            }
        }

    }
}
