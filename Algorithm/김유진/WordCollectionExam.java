package day10;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class WordCollectionExam {
    public static <T> void printWord(List<T> worldList){
        int total = 0; // 글자 수의 합
        int maxSize = 0;
        int MaxIndex = 0;
        //입력된 "quit"은 단어 리스트에서 제거
        for(int i =0; i<worldList.size(); i++){
            if(worldList.get(i).equals("quit")){
                worldList.remove(i);
            }
        }
        // 모든 단어의 개수(단어 수)와 글자 수의 합, 가장 긴 단어 인덱스 찾기
        for(int i =0; i<worldList.size(); i++){
            int size = ((String)worldList.get(i)).length();
            total+= size;
            if(maxSize<size){
                maxSize = size;
                MaxIndex = i;
            }
        }
        // 모든 단어의 개수(단어 수)와 글자 수 출력
        System.out.printf("모든 단어의 개수는 %d개이고, 글자 수의 합은 %d이다.\n", worldList.size(), total);
        // 단어 중에서 가장 긴 단어와 그 길이를 출력
        System.out.printf("가장 긴 단어는 %s이고, 그 단어의 길이는 %d이다.", worldList.get(MaxIndex),((String)worldList.get(MaxIndex)).length());
    }
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> wordList = new ArrayList<String>();
        String word = "";
        while(true){
            System.out.print("단어를 입력해주세요.(quit 입력시 종료) : ");
            word = sc.nextLine();
            wordList.add(word);
            if(word.equals("quit")){
                break;
            }
        }
        printWord(wordList);
        sc.close();
    }
}
