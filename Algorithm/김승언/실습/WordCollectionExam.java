package com.example.day10;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCollectionExam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> wordList = new ArrayList<>();

        // 단어 입력 받기
        String inputWord;
        System.out.println("단어를 입력하세요. 종료하려면 'quit'을 입력하세요.");
        while (true) {
            inputWord = sc.nextLine();

            // 입력이 "quit"인 경우 반복 종료
            if (inputWord.equals("quit")) {
                break;
            }

            // 단어 리스트에 추가
            wordList.add(inputWord);
        }

        // 결과 출력
        System.out.println("입력된 단어:");
        for (int i = 0; i < wordList.size(); i++) {
            System.out.println(wordList.get(i));
        }

        // 단어 개수와 글자 수의 합
        int wordCount = wordList.size();
        int totalChars = 0;
        for (int i = 0; i < wordList.size(); i++) {
            totalChars += wordList.get(i).length();
        }
        System.out.println("단어 수: " + wordCount);
        System.out.println("글자 수의 합: " + totalChars);

        // 가장 긴 단어와 길이 출력
        String longestWord = "";
        int maxLength = 0;
        for (int i = 0; i < wordList.size(); i++) {
            String word = wordList.get(i);
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        System.out.println("가장 긴 단어: " + longestWord);
        System.out.println("가장 긴 단어의 길이: " + maxLength);


        sc.close();
    }
}
