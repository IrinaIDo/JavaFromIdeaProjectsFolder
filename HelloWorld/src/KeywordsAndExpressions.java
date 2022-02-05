public class KeywordsAndExpressions {

    public static void main(String[] args){
        usingElseIf();
        scoringGames();
    }

    public static void usingElseIf(){
        int maxValue = Integer.MAX_VALUE;

        if (maxValue==10){
            System.out.println("Max value equals 10");
        }
        else if (maxValue<10){
            System.out.println("Max value is less than 10");
        }else {
            System.out.println("Max value is grater than 10");
        }
    }

    public static void scoringGames(){
        boolean gameOver = true;
        int newScore = 800;
        int newLevelCompleted = 5;
        int newBonus = 100;

        if (gameOver){
            int finalScore = newScore + newLevelCompleted*newBonus;
            boolean newGameOver = true ? finalScore > 5000 : false;
            if (newGameOver){
                System.out.println("Game over.");
            }
        }
    }
}
