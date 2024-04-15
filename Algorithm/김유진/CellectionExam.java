package day10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 0~100이 아닐시 발생할 예외
class RangeOfException extends Exception{
    public RangeOfException(String message){
        super(message);
    }
}

class Collect{
    // 점수 입력 받기
    public List readScores(Scanner sc, List<Integer> scores)throws RangeOfException{
        int grade = 0;
        while(true){
            try {
                System.out.print("점수를 입력해주세요.(0 입력시 종료) : ");
                grade = sc.nextInt();
                if(grade <=0 || grade >= 100){
                    throw new RangeOfException("0-100사이의 숫자만 입력이 가능합니다.");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            scores.add(grade);
            if(grade == 0) {
                break;
            }
        }
        return scores;
    }

    // 0점 제거
    public List removeZero(List<Integer> scores){
       for(int i =0; i<scores.size(); i++){
           if(scores.get(i) == 0){
               scores.remove(i);
           }
       }
       return scores;
    }

    // 결과 출력
    public void printScores(List<Integer> scores){
        for(Integer result : scores){
            System.out.println(result);
        }
    }
}
public class CellectionExam {
    public static void main(String[] args) throws RangeOfException {
        Scanner sc = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();
        Collect collect = new Collect();

        // 점수 입력 받기
        scores = collect.readScores(sc, scores);

        // 0점 제거
        scores = collect.removeZero(scores);

        // 결과 출력
        collect.printScores(scores);

        // 리소스 정리
        sc.close();
    }
}