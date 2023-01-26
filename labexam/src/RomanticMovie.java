import java.util.Scanner;

public class RomanticMovie implements Movies {
    String id, catgory, title, studio;
    int rating;

    @Override
    public void displayDetails() {
        System.out.println("movie title :" + title);
        System.out.println("movie catagory: " + catgory);
        System.out.println("movie rating: " + rating);
        System.out.println("movie id:" + id);

    }

    @Override
    public int getNumberOfMovies() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("add an number of romantic movie");
        int numRomaticMovie = scanner.nextInt();
        System.out.println(" you have " + numRomaticMovie + " romantic movies");

        return numRomaticMovie;
    }

    @Override
    public void displayCatagory() {
        System.out.println("romantic movies");

    }

    RomanticMovie() {
        int i = 0;
        this.catgory = "unset";
        this.id = "unset" + i++;
    }

    RomanticMovie(String id, String catgory, String title, String studio, int rating) {
        this.id = id;
        this.title = title;
        this.catgory = catgory;
        this.rating = rating;
        this.studio = studio;

    }

}
