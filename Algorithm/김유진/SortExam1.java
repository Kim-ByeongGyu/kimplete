package practice_0328;
import java.util.Scanner;
//배열을 정렬하는건 쉬운데 수는 정렬을 어떻게 할까?
//https://www.acmicpc.net/problem/1427
public class SortExam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;

            System.out.println("자연수를 입력하라");
            N = sc.nextInt();


        String str = Integer.toString(N); // int를 문자열로 변환
        String temp= ""; // 정렬 한 문자열을 담을 임시 저장소
        //9부터 0까지 입력받은 수를 비교하여 같으면 담는다 <- 큰수부터 비교하기 때문에 내림차순
        for(char a ='9'; a >= '0'; a--){
            for(int i = 0; i<str.length(); i++){
                if(a == str.charAt(i)){
                    temp+=str.charAt(i);
                }
            }
        }
        N = Integer.parseInt(temp);

        System.out.println(N);

    }
}
