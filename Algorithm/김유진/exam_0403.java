// https://school.programmers.co.kr/learn/courses/30/lessons/81301
class Solution {
    public int solution(String s) {
        // 각 영단어에 해당하는 숫자를 포함하는 문자열을 배열로 정의
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        // 문자열 s를 숫자로 변환하기 위한 임시 문자열
        StringBuilder temp = new StringBuilder(s);

        // 영단어에 해당하는 숫자를 포함하는 문자열을 찾아 숫자로 바꿈
        for (int i = 0; i < numbers.length; i++) {
            temp = new StringBuilder(temp.toString().replace(numbers[i], Integer.toString(i)));
        }

        // 숫자로 변환된 문자열을 반환
        return Integer.parseInt(temp.toString());
    }
}
