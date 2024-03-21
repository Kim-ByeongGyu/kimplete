import java.util.Arrays;

public class TeamProblem3 {
    //팀별 회고 알고리즘 풀이 0321
    //주어진 사람 이름과 나이 리스트를 나이순으로 정렬
    public static void bubbleAge(int[] arrAge, String[] arrName){
        int tempAge;
        String tempName;
        for(int j = 0; j < arrAge.length - 1; j++) {
            for (int i = 0; i < arrAge.length - 1 - j; i++) {
                if (arrAge[i] > arrAge[i + 1]) {
                    tempAge = arrAge[i];
                    arrAge[i] = arrAge[i + 1];
                    arrAge[i + 1] = tempAge;
                    tempName = arrName[i];
                    arrName[i] = arrName[i + 1];
                    arrName[i + 1] = tempName;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arrAge = {3,44,5,26,21,7,58};
        String[] arrName = {"A","B","C","D","E","F","G"};
        bubbleAge(arrAge, arrName);
        System.out.println(Arrays.toString(arrAge));
        System.out.println(Arrays.toString(arrName));
    }
}
