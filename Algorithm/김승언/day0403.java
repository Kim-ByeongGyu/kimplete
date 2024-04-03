package dailyAlgorithm.Solution;
import java.util.*;

class Solution {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12981?language=java
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> usedWords = new HashSet<>();

        char lastChar = words[0].charAt(words[0].length() - 1); // 첫 번째 단어의 마지막 글자로 시작
        usedWords.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String currentWord = words[i];

            // 끝말잇기 규칙에 어긋나는 경우
            if (currentWord.charAt(0) != lastChar || usedWords.contains(currentWord)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }

            // 끝말잇기 규칙을 지키는 경우
            usedWords.add(currentWord);
            lastChar = currentWord.charAt(currentWord.length() - 1); // 마지막 글자 갱신
        }

        return answer[0] == 0 ? new int[]{0, 0} : answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int n1 = 3;
        String[] words1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int[] result1 = solution.solution(n1, words1);
        System.out.println(Arrays.toString(result1)); // Expected: [3, 3]

        int n2 = 5;
        String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        int[] result2 = solution.solution(n2, words2);
        System.out.println(Arrays.toString(result2)); // Expected: [0, 0]

        int n3 = 2;
        String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};
        int[] result3 = solution.solution(n3, words3);
        System.out.println(Arrays.toString(result3)); // Expected: [1, 3]
    }
}
