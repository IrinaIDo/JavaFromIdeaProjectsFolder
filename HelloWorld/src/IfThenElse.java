public class IfThenElse {

    public static void main(String[] args){

    }

    public static void first(){
        boolean isAlien = false;
        if (!isAlien){  //instead of (isAlien == false)
            System.out.println("It is not an Alien!");
        }

        int topScore = 80;
        if (topScore != 100){  //>;==;<;<=;>=
            System.out.println("You did not get the high score.");
        }

        int secondTopScore = 60;
        if (topScore>secondTopScore && topScore<100){
            System.out.println("Greater than second top score and less than 100.");
        }
    }
}
