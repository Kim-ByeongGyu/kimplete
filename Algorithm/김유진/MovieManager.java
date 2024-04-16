package day11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
영화 객체를 관리하고, 다양한 기준으로 정렬할 수 있는 시스템을 구현합니다.
ArrayList를 사용하여 영화 목록을 관리하고, Collections.sort() 메서드를 이용하여 영화를 정렬합니다.
Comparable과 Comparator를 구현하여 영화를 제목, 출시 연도, 평점에 따라 정렬할 수 있게 합니다.
과제
Movie 클래스를 생성하고, 제목, 출시 연도, 평점을 속성으로 갖습니다.
Movie 클래스에서 Comparable 인터페이스를 구현하여 기본적으로 제목에 따라 정렬하도록 합니다.
제목, 출시 연도, 평점에 따라 정렬할 수 있도록 별도의 Comparator를 구현합니다.
 */
class Movie implements Comparable<Movie>{
    private String title;
    private int release;
    private double grade;

    public String getTitle(){
        return title;
    }

    public double getGrade() {
        return grade;
    }

    public int getRelease() {
        return release;
    }

    public Movie(String title, int release, double grade){
        this.title = title;
        this.release = release;
        this.grade = grade;
    }
    @Override
    public int compareTo(Movie o) {
        return this.title.compareTo(o.getTitle());
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' + ", release=" + release + ", grade=" + grade;
    }
}

// Comparator 인터페이스 구현
class RatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return Double.compare(o1.getGrade(),o2.getGrade());
    }
}
class ReleaseYearComparator implements Comparator<Movie>{
    @Override
    public int compare(Movie o1, Movie o2) {
        return Integer.compare(o1.getRelease(),o2.getRelease());
    }
}

public class MovieManager {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Shawshank Redemption", 1994, 9.3));
        movies.add(new Movie("The Godfather", 1972, 9.2));
        movies.add(new Movie("The Dark Knight", 2008, 9.0));

        // 제목 기준 정렬 (Comparable)
        Collections.sort(movies);
        System.out.println("Sorted by title:");
        movies.forEach(System.out::println);
        System.out.println("\n----------------------------------------- \n");
        // 평점 기준 정렬 (Comparator)
        Collections.sort(movies, new RatingComparator());
        System.out.println("Sorted by rating:");
        movies.forEach(System.out::println);
        System.out.println("\n----------------------------------------- \n");
        // 출시 연도 기준 정렬 (Comparator)
        Collections.sort(movies, new ReleaseYearComparator());
        System.out.println("Sorted by release year:");
        movies.forEach(System.out::println);
    }
}
