import java.util.Random;
import java.util.Scanner;

public class TeamProblem {
    //팀별 회고 알고리즘 풀이
    //문제 : 0에서 10까지의 숫자 중 랜덤으로 입력받은 숫자크기의 배열에 넣은 후 5의 개수 구하기
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자 개수: ");
        int count = 0;
        int num = scan.nextInt();
        int number[] = new int[num];
        for(int i = 0; i < num; i++){
            number[i] = rand.nextInt(10);
            System.out.printf("숫자%d: %d", i + 1, number[i]);
            System.out.println();
        }
        for(int i = 0; i < num; i++){
            if(number[i] == 5)
                count++;
        }
        System.out.println(count);
    }
}
