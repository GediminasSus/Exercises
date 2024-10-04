package challanges;

public class Challange4 {
    public static void main(String[] args) {
        
       displayHighScoreposition("Tim", calculateHighScorePosition(1500));
       displayHighScoreposition("Bob", calculateHighScorePosition(999));
       displayHighScoreposition("Percy", calculateHighScorePosition(499));
       displayHighScoreposition("Gilbert", calculateHighScorePosition(99));
       displayHighScoreposition("James", calculateHighScorePosition(-100));
    }
    public static void  displayHighScoreposition(String playerName, int position) {
        System.out.println(playerName +" managed to get into position " + position + " on the high score list");
            
    }
    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (500 <= score ) { //else if (500 <= score && score < 1000)
            return 2;
        } else if (100 <= score ) { //else if (100 <= score && score < 500)
            return 3;
        }
        return 4;    
    }
}
// int postion = 4;
// if (score >= 1000) {
//     position = 1;
// } else if (500 <= score ) { //else if (500 <= score && score < 1000)
//     position = 2;
// } else if (100 <= score ) { //else if (100 <= score && score < 500)
//     position = 3;
// }
// return position;    
