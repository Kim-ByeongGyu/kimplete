package com.example.day09;

import java.util.Calendar;
import java.util.Scanner;

public class Calender2 {



        public static void printCalendar(int year, int month) {
            // 달력 만들기
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month - 1, 1);
            // 해당 월의 첫 요일
            int firstDay = calendar.get(Calendar.DAY_OF_WEEK);
            // 해당 월의 마지막요일
            int lastDay = calendar.getActualMaximum(Calendar.DATE);

            // 요일을 한글로 표시
            String[] dayOfWeek = {"일", "월", "화", "수", "목", "금", "토"};

            System.out.println("\t\t" + calendar.get(Calendar.YEAR) + "년 " + (calendar.get(Calendar.MONTH) + 1) + "월");
            System.out.println("일\t월\t화\t수\t목\t금\t토");

            // 첫 번째 주 전까지 공백 출력
            for (int i = 1; i < firstDay; i++) {
                System.out.print("\t");
            }

            // 달력 출력
            for (int i = 1; i <= lastDay; i++) {
                System.out.print(i + "(" + dayOfWeek[(firstDay - 1) % 7] + ")\t");
                if (firstDay % 7 == 0) {
                    System.out.println();
                }
                firstDay++;
            }
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int year, month;
            while (true) {
                System.out.println("달력을 출력할 연도와 월을 입력하세요 (yyyy mm), 종료하려면 -1을 입력하세요:");
                year = sc.nextInt();
                if (year == -1) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                month = sc.nextInt();
                if (month < 1 || month > 12) {
                    System.out.println("올바르지 않은 월을 입력했습니다. 1에서 12 사이의 값을 입력하세요.");
                    continue;
                }
                printCalendar(year, month);
            }
            sc.close();
        }
    }


