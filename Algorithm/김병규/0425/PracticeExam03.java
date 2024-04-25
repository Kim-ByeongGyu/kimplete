package com.example.day0425;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class PracticeExam03 {
    public static void main(String[] args) {
        // 실습 문제 3: 학생 성적 처리
        // 학생 객체의 리스트가 주어졌을 때, 성적(score)이 80점 이상인 학생들만을 선택하고, 이들의 이름을 알파벳 순으로 정렬하여 출력하시오.
        List<Student> students = Arrays.asList(
                new Student("Alice", 82),
                new Student("Bob", 90),
                new Student("Charlie", 72),
                new Student("David", 76)
        );
        students.stream()
                .filter(student -> student.getScore() >= 80)
                .map(Student::getName)
                .sorted()
                .collect(Collectors.toList()).forEach(System.out::println);
;

    }
}
