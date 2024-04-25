package day0425;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 학생 객체 리스트가 주어졌을떄, 성적이 80점 이상인 학생들만 선택하고, 이들의 이름을 알파벳순으로 정렬하라

class Student  implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
public class practice_03 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Alice", 82),
                new Student("Bob", 90),
                new Student("Charlie", 72),
                new Student("David", 76)
        );

        List<Student> grade  = students.stream().filter(x -> x.getAge() >= 80).sorted().collect(Collectors.toList());
        grade.forEach(student -> System.out.println(student.getName()));
    }
}
