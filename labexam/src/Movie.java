import javax.swing.Action;

public class Movie {
    public static void main(String[] args) throws Exception {
        ActionMovies actionMovies = new ActionMovies("rt857", "action", "contractor", "netfilx", 19);
        RomanticMovie romanticMovie = new RomanticMovie("2844", "romance", " Perfect pair", "univeral studios", 5);
        // romanticMovie.displayCatagory();
        actionMovies.displayDetails();
        actionMovies.getNumberOfMovies();
        romanticMovie.displayDetails();
        romanticMovie.displayCatagory();
        romanticMovie.getNumberOfMovies();
        ActionRomance actionRomance = new ActionRomance();
        actionRomance.calculateTotalMovies();

    }
}
