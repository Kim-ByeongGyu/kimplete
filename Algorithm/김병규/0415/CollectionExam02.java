package com.example.day0415;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionExam02 {
    //입력 처리
    //Scanner 클래스를 사용하여 사용자로부터 입력을 받습니다.
    //사용자가 0(더 이상입력하고 싶지 않을 때)을 입력할 때까지 반복하여 점수를 입력받습니다.
    //입력 받은 점수는 ArrayList<Integer>에 저장됩니다.

    //점수 유효성 검사
    //입력 받은 점수가 0부터 100 사이가 아니면 예외를 발생시키고,
    //에러 메시지로 "0-100사이의 숫자만 입력이 가능합니다."와 해당 점수를 출력합니다.
    //예외 발생 시, 에러 스택 트레이스를 출력합니다.
    private static void readScores(Scanner sc, List<Integer> scores) {
        int score = -1;
        do {
            try {
                score = sc.nextInt();
                if (score < 0 || score > 100) {
                    throw new IllegalArgumentException("0 ~ 100 사이의 값만 입력 가능합니다.");
                } else {
                    scores.add(score);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (score != 0);
    }
    //점수 리스트 관리
    //입력된 0은 점수 리스트에서 제거합니다. (종료 신호로 사용됨)
    private static void removeZero(List<Integer> scores) {
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) == 0) {
                scores.remove(i);
            }
        }
    }
    //결과 출력
    //입력된 점수를 모두 출력합니다.
    //입력된 모든 점수의 합(총점)과 평균을 계산하여 출력합니다.
    //평균은 정수로 계산하여 출력합니다.
    private static void printScores(List<Integer> scores) {
        int sum = 0;
        for (int score : scores) {
            System.out.println(score);
            sum += score;
        }
        int avg = sum/scores.size();
        System.out.println("점수 합계 ::: " + sum);
        System.out.println("점수 평균 ::: " + avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();

        // 점수 입력 받기
        readScores(sc, scores);

        // 0점 제거
        removeZero(scores);

        // 결과 출력
        printScores(scores);

        // 리소스 정리
        sc.close();
    }
}
