package complex;

import java.util.Arrays;
import java.util.Scanner;

public class CinemaSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cinema[] cinemas = new Cinema[4];
        for(int i=0; i<cinemas.length; i++) {
            int movieId = sc.nextInt(); sc.nextLine();
            String director = sc.nextLine();
            int rating = sc.nextInt(); sc.nextLine();
            int budget = sc.nextInt(); sc.nextLine();

            cinemas[i] = new Cinema(movieId, director, rating, budget);
        }
        String srcDirector = sc.nextLine();
        int srcRating = sc.nextInt(); sc.nextLine();
        int srcBudget = sc.nextInt(); sc.nextLine();
        sc.close();

        int result1 = findAvgBudgetByDirector(cinemas, srcDirector);
        if( result1 > 0) {
            System.out.println(result1);
        } else {
            System.out.println("Sorry - The given director has not yet directed any movie");
        }

        Cinema result2 = getMovieByRatingBudget(cinemas, srcRating, srcBudget);
        if(result2 != null) {
            System.out.println(result2.getMovieId());
        }
        else {
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }
    }

    public static int findAvgBudgetByDirector(Cinema[] cinemas, String srcDirector) {
        int sum = 0;
        int k = 0;
        for(int i=0; i<cinemas.length; i++) {
            if(cinemas[i].getDirector().equalsIgnoreCase(srcDirector)) {
                sum +=cinemas[i].getBudget();
                k++;
            }
        }
        if(k>0) {
            int avg = sum/k;
            return avg;
        }
        else {
            return 0;
        }
        
    }

    public static Cinema getMovieByRatingBudget(Cinema[] cinemas, int srcRating, int srcBudget) {
        for(int i=0; i<cinemas.length; i++) {
            if(cinemas[i].getBudget()==srcBudget && cinemas[i].getRating()==srcRating) {
                if(srcBudget%srcRating == 0) {
                    return cinemas[i];
                }
                else {
                    return null;
                }
            }
        }
        return null;
    }

    
    
}

class Cinema {
    int movieId;
    String director;
    int rating;
    int budget;

    public Cinema(int movieId, String director, int rating, int budget) {
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}

/*

1101
GVM
4
100
1201
Shankar
5
500
1301
Shankar
3
50
1401
GVM
5
300
GVM
5
300

output:
200
1401

 */