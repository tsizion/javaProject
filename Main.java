import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int position= calculateHighScore(1500);
        displayHighScorePosition("tim", position);
        position = calculateHighScore(900);
        displayHighScorePosition("beti", position);
        position = calculateHighScore(400);
        displayHighScorePosition("maki", position);
        position = calculateHighScore(50);
        displayHighScorePosition("minase", position);


    }

    public static void displayHighScorePosition(String name, int position) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(name + " managed to get in postion " + position);
    }

    public static int calculateHighScore(int score) {
        int position=4;
        if (score > 1000) {
            position=1;
        } else if (score > 500 && score < 1000) {
            position=2;
        } else if (score > 100 && score < 500) {
            position=3;
        } else {position=4 ;}


        return position;
    } }