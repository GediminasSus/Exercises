
public class MethodOverloading{

    public static void main(String [] args) {

        System.out.println("New score is " + calculateScore("Tim",500));
        System.out.println("New score is " + calculateScore(10));
    }

    public static int calculateScore(String playerName, int score) { 

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score, String playerName) { 

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) { 
        return calculateScore("Anonymus", score);
    }
    public static void calculateScore() {
        System.out.println("No player name, no player score");

    }

}