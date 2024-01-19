package objectarrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Movie {
        private int yearReleased;
        private double rating;
        private double budget;
        private double collectionAmount;

        public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
            this.yearReleased = yearReleased;
            this.rating = rating;
            this.budget = budget;
            this.collectionAmount = collectionAmount;
        }

        public int getYearReleased() {
            return yearReleased;
        }
        public void setYearReleased(int yearReleased) {
            this.yearReleased = yearReleased;
        }

        public double getRating() {
            return rating;
        }
        public void setRating(double rating) {
            this.rating = rating;
        }

        public double getBudget() {
            return budget;
        }
        public void setBudget(double budget) {
            this.budget = budget;
        }

        public double getCollectionAmount() {
            return collectionAmount;
        }
        public void setCollectionAmount(double collectionAmount) {
            this.collectionAmount = collectionAmount;
        }

        // Comparator for sorting by rating and profit
        public static Comparator<Movie> ratingAndProfitComparator = Comparator
                .comparing(Movie::getRating)
                .thenComparingDouble(movie -> movie.getCollectionAmount() - movie.getBudget());

        // Comparator for sorting by year released and rating
        public static Comparator<Movie> yearReleasedAndRatingComparator = Comparator
                .comparingInt(Movie::getYearReleased)
                .thenComparingDouble(Movie::getRating);

        // Example of usage
        public static void main(String[] args) {
            List<Movie> movies = new ArrayList<>();
            movies.add(new Movie(2005, 8.5, 50_000_000, 200_000_000));
            movies.add(new Movie(2010, 7.8, 80_000_000, 150_000_000));
            movies.add(new Movie(2015, 9.2, 120_000_000, 400_000_000));

            Collections.sort(movies, Movie.ratingAndProfitComparator);
            System.out.println("Sorted by Rating and Profit:");
            movies.forEach(movie -> System.out.println(movie.getRating() + " - " + (movie.getCollectionAmount() - movie.getBudget())));


            Collections.sort(movies, Movie.yearReleasedAndRatingComparator);
            System.out.println("\nSorted by Year Released and Rating:");
            movies.forEach(movie -> System.out.println(movie.getYearReleased() + " - " + movie.getRating()));
        }
}
