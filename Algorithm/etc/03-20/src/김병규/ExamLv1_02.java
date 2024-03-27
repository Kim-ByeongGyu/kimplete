package algoritm;

public class ExamLv1_02 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12919?language=java
    static String fineKim (String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i] == "Kim") {
                answer = "김서방은 "+i+"에 있다";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};

        System.out.println(fineKim(seoul));
    }
}
