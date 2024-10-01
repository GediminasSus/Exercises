public class Methods {
    public static void main(String[] args) {
        // boolean gameOver = true;
        // int score = 10000;
        // int levelCompleted = 8;
        // int bonus = 200;

        //calculateScore(gameOver, score, levelCompleted, bonus);
        
        int highScore = calculateScore(true, 1000, 5, 200);
        System.out.println("Your final score was " + highScore);

        System.out.println("The next score was " + calculateScore(true, 500, 6, 5));
        
    }
    
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { //void doesnt return information
        int finalScore = score;
        if (gameOver == true) { // or if (gameOver)
            finalScore += (levelCompleted * bonus); // or finalScore = score + (levelCompleted * bonus)   
        }
        return finalScore;
    }
}
