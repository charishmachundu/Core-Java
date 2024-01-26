package objectarrays;
import java.util.*;

public class Movie {
    int yearReleased;
    double rating;
    double budget;
    double collectionAmount;
    
    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }
    public int getYearReleased() {
        return yearReleased;
    }
    public double getRating() {
        return rating;
    }
    public double getBudget() {
        return budget;
    }
    public double getCollectionAmount() {
        return collectionAmount;
    }
    public static class RatingProfitComparator implements Comparator<Movie> {
        @Override
        public int compare(Movie m1, Movie m2) {
            if(m1.rating>=m2.rating && m1.collectionAmount>=m2.collectionAmount)
                return 1;
            else
                return -1;
        }
    }
    public static class YearRatingComparator implements Comparator<Movie> {
        @Override
        public int compare(Movie m1, Movie m2) {
            if (m1.yearReleased >=m2.yearReleased && m1.rating >=m2.rating)
                return 1;
            else
                return -1;
        }
    }

    // Example usage
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(2000, 8.5, 50.0, 150.0));
        movies.add(new Movie(1995, 7.8, 30.0, 120.0));
        movies.add(new Movie(2005, 9.2, 80.0, 120.0));

        // Sort movies by rating and profit using RatingProfitComparator
        Collections.sort(movies, new RatingProfitComparator());
        System.out.println("Sorted by Rating and collectionAmount:");
        displayMovies(movies);

        // Sort movies by year released and rating using YearRatingComparator
        Collections.sort(movies, new YearRatingComparator());
        System.out.println("\nSorted by Year Released and Rating:");
        displayMovies(movies);
    }
    private static void displayMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println("Year Released: " + movie.getYearReleased() +
                    ", Rating: " + movie.getRating() +
                    ", Budget: " + movie.getBudget() +
                    ", Collection Amount: " + movie.getCollectionAmount());
        }
    }
}
