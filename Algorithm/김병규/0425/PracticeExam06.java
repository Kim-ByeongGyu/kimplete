package com.example.day0425;

import java.util.*;
import java.util.stream.Collectors;

class StudentNew {
    private String name;
    private int age;
    private int score;

    public StudentNew(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }
}

public class PracticeExam06 {
    public static void main(String[] args) {
        // 실습 문제 6: 나이대별 평균 점수 계산
        // 학생 리스트에서 나이대별(10대, 20대 등)로 평균 점수를 계산하시오.
        List<StudentNew> students = Arrays.asList(
                new StudentNew("Alice", 14, 88),
                new StudentNew("Bob", 23, 82),
                new StudentNew("Charlie", 17, 95),
                new StudentNew("David", 21, 73)
        );

        Map<Integer, Double> result = students.stream()
                .collect(Collectors.groupingBy(student -> (student.getAge() / 10) * 10,
                        Collectors.averagingDouble(StudentNew::getScore)));

        result.forEach((age, avg) -> System.out.println(age + " : " + avg));
    }
}
