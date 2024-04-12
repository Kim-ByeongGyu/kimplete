package com.example.day0412;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExam {
    public static void printCalender(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        if (year < 1 || month < 1 || month > 12) {
            System.out.println("유효한 년도 및 월을 입력해주세요.");
            return;
        }

        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);

        int maxDate = calendar.getActualMaximum(Calendar.DATE);

        // 1날짜를 1일로 변경하여 첫째주로 이동
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int startMonth = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.printf("       ==%2d월 ==\n", month);
        System.out.println("  S  M  T  W  T  F  S");
        // 달력의 첫 주에 빈 공간 추가
        int week = startMonth - 1;
        for (int j = 1; j < startMonth; j++) {
            System.out.print("   ");
        }
        // 날짜 출력
        for (int i = 1; i < maxDate + 1; i++) {
            if (week == 7) {
                System.out.println();
                week = 0;
            }
            System.out.printf("%3d",i);
            week++;
        }
    }
    public static void main(String[] args) {
        // 년, 월을 입력받아 해당 년의 월의 달력을 출력하자.
        Scanner sc = new Scanner(System.in);

        System.out.println("년을 입력");
        int year = sc.nextInt();
        System.out.println("월을 입력");
        int month = sc.nextInt();

        printCalender(year, month);
    }
}
