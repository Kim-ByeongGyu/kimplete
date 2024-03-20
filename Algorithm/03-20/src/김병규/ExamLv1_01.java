package algoritm;

public class ExamLv1_01 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12916?language=java
    static boolean findpy (String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='p' || s.charAt(i)=='P') {
                p++;
            } else if (s.charAt(i)=='y' || s.charAt(i)=='Y') {
                y++;
            }
        }
        if (y!=p) answer = false;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(findpy("pPoooyY"));
        System.out.println(findpy("Pyy"));
    }
}
