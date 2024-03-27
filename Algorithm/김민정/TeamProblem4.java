import java.util.Scanner;

public class TeamProblem4 {
    //팀별 회고 알고리즘 풀이 3월 27일
    //학생 수와 이름을 입력받아 학생 번호를 입력하면 해당하는 학생의 이름을 출력
    static int sequentialSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("학생 수를 입력하세요.: ");
        int num = scan.nextInt();
        int[] studentNum = new int[num];
        String[] studentName = new String[num];
        for(int i = 0; i < num; i++) {
            System.out.println("학생 번호를 입력하세요.: ");
            studentNum[i] = scan.nextInt();
            System.out.println("학생 이름를 입력하세요.: ");
            studentName[i] = scan.next();
        }
        System.out.println("찾을 학생 번호를 입력하세요.: ");
        int key = scan.nextInt();
        int idx = sequentialSearch(studentNum, key);
        System.out.println("학생의 이름: " + studentName[idx]);
    }
}
