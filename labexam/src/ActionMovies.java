import java.util.Scanner;

public class ActionMovies extends RomanticMovie implements Movies {
    Scanner scanner = new Scanner(System.in);
    String id, catgory, title, studio;
    int rating;

    ActionMovies() {
        int i = 0;
        this.catgory = "unset";
        this.id = "unset" + i++;
    }

    ActionMovies(String id, String catgory, String title, String studio, int rating) {
        this.id = id;
        this.title = title;
        this.catgory = catgory;
        this.rating = rating;
        this.studio = studio;

    }

    @Override
    public void displayDetails() {

        System.out.println("movie title" + title);
        System.out.println("movie catagory" + catgory);
        System.out.println("movie rating" + rating);
        System.out.println("movie id" + id);

    }

    @Override
    public int getNumberOfMovies() {
        System.out.println("add an number of action movie");
        Scanner scanner = new Scanner(System.in);
        int numACmovie = scanner.nextInt();
        System.out.println(" we have " + numACmovie + " action movies");
        return numACmovie;
    }

    @Override
    public void displayCatagory() {
        System.out.println("movie catagory" + catgory);

    }

}
