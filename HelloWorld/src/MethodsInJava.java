public class MethodsInJava {

    public static void main(String[] args){
        int scoreToReturn = scoreToReturn();
        System.out.println(scoreToReturn);
        scoringPlayers();
    }

    public static int scoreToReturn(){
        return Integer.MAX_VALUE;
    }

    public static void displayHighScorePosition(String playersName, int positionInTheHighScoreTable){
        System.out.println(playersName + " managed to get the position " + positionInTheHighScoreTable);
    }

    public static int calculateHighScorePosition(int playerScore){
        boolean scoreBetween500And1000 = (playerScore>=500) && (playerScore<1000);
        boolean scoreBetween100And500 = (playerScore>=100) && (playerScore<500);
//        int playerScorePosition;
        if (scoreBetween100And500) {
//            playerScorePosition = 3;
            return 3;
        }
        else if (scoreBetween500And1000) {
//            playerScorePosition = 2;
            return 2;
        }
        else if (playerScore >= 1000) {
//            playerScorePosition = 1;
            return 1;
        }
        else {
//            playerScorePosition = 4;
            return 4;
        }

//        return playerScorePosition;
    }

    public static int calculateHighScorePositionSecondMethod(int playerScore) {
     if (playerScore >= 1000){
         return 1;
     }else if (playerScore >= 500){
         return 2;
     }else if (playerScore >= 100){
         return 3;
     }else{
         return 4;
     }
    }

    public static void scoringPlayers(){
        String player1Name = "Marta";
        String player2Name = "Maria";
        int[] scoringGiven = {1500, 900, 400, 50};
        for (int j : scoringGiven) {
            displayHighScorePosition(player1Name, calculateHighScorePosition(j));
            displayHighScorePosition(player2Name, calculateHighScorePositionSecondMethod(j));
        }
    }
}
