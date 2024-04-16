package example.practice.day0416;

import java.util.*;

class Movie implements Comparable<Movie>{
    String title;
    int releaseYear;
    double rating;
    Movie(String title, int releaseYear, double rating){
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    @Override
    public int compareTo(Movie o) {
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return releaseYear + "년에 출시된 " + title+ "의 평점은 "+ rating + "입니다.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return releaseYear == movie.releaseYear && Double.compare(rating, movie.rating) == 0 && Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, releaseYear, rating);
    }
}
/*
class RatingComparator implements Comparator<Movie>{
}
*/
public class MovieManager {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The ShawShank Redemption", 1994, 9.3));
        movies.add(new Movie("The Godfather",1972, 9.2));
        movies.add(new Movie("The Dark Knight", 2008, 9.0));

        Collections.sort(movies);
        System.out.println("-sorted by title-");
        movies.forEach(System.out::println);

        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
//                if((o2.rating - o1.rating) < 0)
//                    return -1;
//                else if(o2.rating == o1.rating)
//                    return 0;
//                else return 1;
                return Double.compare(o2.rating, o1.rating);
            }
        });
        System.out.println("-sorted by rating-");
        movies.forEach(System.out::println);

        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.releaseYear - o2.releaseYear;
            }
        });
        System.out.println("-sorted by year-");
        movies.forEach(System.out::println);
    }
}
