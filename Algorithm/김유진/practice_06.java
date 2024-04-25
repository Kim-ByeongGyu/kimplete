package day0425;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student1 {
    private String name;
    private int age;
    private int score;

    public Student1(String name, int age, int score) {
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

// 학생 리스트에서 나이대 별로 평균 점수 계산
public class practice_06 {
    public static void main(String[] args) {
        List<Student1> students = Arrays.asList(
                new Student1("Alice", 14, 88),
                new Student1("Bob", 23, 82),
                new Student1("Charlie", 17, 95),
                new Student1("David", 21, 73)
        );

        Map<Integer,Double> list = students.stream() .collect(Collectors.groupingBy(student -> student.getAge() / 10 * 10,
                Collectors.averagingDouble(Student1::getScore)));
        list.forEach((age, averageScore) -> {
            System.out.println(age + "s: " + averageScore);
        });
    }
}
