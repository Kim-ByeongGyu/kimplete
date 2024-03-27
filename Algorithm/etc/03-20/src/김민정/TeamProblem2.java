import java.util.Scanner;

public class TeamProblem2 {
    //팀별 회고 알고리즘 풀이 3월 20일
    //주어진 학생 번호와 이름 리스트에서 학생 번호를 입력하면 해당하는 학생의 이름을 출력
    static int sequentialSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int studentNum[] = {1,2,3,4,5,6,7};
        String studentName[] = {"A","B","C","D","E","F","G"};
        Scanner scan = new Scanner(System.in);
        System.out.println("학생 번호를 입력하세요.: ");
        int key = scan.nextInt();
        int idx = sequentialSearch(studentNum, key);
        System.out.println("학생의 이름: " + studentName[idx]);
    }
}
