package com.example.day0416;

import java.util.*;

    class Movie implements Comparable<Movie> {

        private String title;  // 영화제목
        private int releaseYear;  // 출시 연도
        private double rating;  // 평점

        public Movie(String title, int releaseYear, double rating) {
            this.title = title;
            this.releaseYear = releaseYear;
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public int getReleaseYear() {
            return releaseYear;
        }

        public double getRating() {
            return rating;
        }

        @Override
        public String toString() {
            return title + " (" + releaseYear + ") - " + rating;
        }

        @Override
        public int compareTo(Movie otherMovie) {
            return this.title.compareTo(otherMovie.getTitle());
        }
    }

    // RatingComparator 클래스 구현
    class RatingComparator implements Comparator<Movie> {
        // 평점에 따라 내림차순으로 정렬
        @Override
        public int compare(Movie movie1, Movie movie2) {
            return Double.compare(movie2.getRating(), movie1.getRating()); // 내림차순 정렬
        }
    }

    // ReleaseYearComparator 클래스 구현
    class ReleaseYearComparator implements Comparator<Movie> {
        // 출시 연도에 따라 오름차순으로 정렬
        @Override
        public int compare(Movie movie1, Movie movie2) {
            return Integer.compare(movie1.getReleaseYear(), movie2.getReleaseYear()); // 오름차순 정렬
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
            Collections.sort(movies, new RatingComparator());
            System.out.println("Sorted by rating:");
            movies.forEach(System.out::println);

            // 출시 연도 기준 정렬 (Comparator)
            Collections.sort(movies, new ReleaseYearComparator());
            System.out.println("Sorted by release year:");
            movies.forEach(System.out::println);
        }
    }

