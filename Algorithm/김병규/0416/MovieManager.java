package com.example.day0416;

import java.util.*;

class Movie implements Comparable<Movie>{
    String name;
    int year;
    double value;

    public Movie(String name, int year, double value) {
        this.name = name;
        this.year = year;
        this.value = value;
    }

    @Override
    public int compareTo(Movie o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name + "(" + year + ")" + "   평점 : " + value;
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

        // 평점 기준 정렬 (Comparator)
        Collections.sort(movies, new Comparator<Movie>(

        ) {
            @Override
            public int compare(Movie o1, Movie o2) {
                double value = o1.value - o2.value;
                int intValue = (int) value;
                return  intValue;
            }
        });
        System.out.println("Sorted by rating:");
        movies.forEach(System.out::println);

        // 출시 연도 기준 정렬 (Comparator)
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.year - o2.year;
            }
        });
        System.out.println("Sorted by release year:");
        movies.forEach(System.out::println);
    }
}
