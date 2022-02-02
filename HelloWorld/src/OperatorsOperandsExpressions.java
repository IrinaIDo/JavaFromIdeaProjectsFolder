public class OperatorsOperandsExpressions {
    // see java operator precedence table
    public static void main(String[] args){
        plusMinusOperator();
        logicalAndOperator();
        logicalOrOperator();
        assignmentOperator();
        ternaryOperator();
        challengeOnOperators();
    }

    public static void plusMinusOperator(){
        int result = 1+2;
        System.out.println("Result = "+result);
        int previousResult = ((result-1)*10)/5;
        System.out.println("Previous result = "+previousResult);
        int remainder = previousResult % 3;
        System.out.println(remainder);

        result++; //result=result+1
        System.out.println("The result++ is: "+result);
        result--; //result=result-1
        System.out.println("The result-- is: "+result);

        result+=2; //result=result+2
        System.out.println("The result+=2 is: "+result);

        result-=2; //result=result-2
        System.out.println("The result-=2 is: "+result);

        result*=10; //result=result*10
        System.out.println("The result*=10 is: "+result);

        result/=3; //result=result/3
        System.out.println("The result/=3 is: "+result);

    }

    public static void logicalOrOperator(){

        int primaryScore = 20;
        int maxScore = 100;

        int topScore = primaryScore*4;
        if (topScore != maxScore){  //>;==;<;<=;>=
            System.out.println("You did not get the high score.");
        }

        int secondTopScore = topScore-primaryScore;
        if ((topScore > secondTopScore) || (topScore < maxScore)){
            System.out.println("Greater than second top score and less than 100.");
        }
    }

    public static void logicalAndOperator(){

        int primaryScore = 20;
        int maxScore = 100;

        int topScore = primaryScore*4;
        if (topScore != maxScore){  //>;==;<;<=;>=
            System.out.println("You did not get the high score.");
        }

        int secondTopScore = topScore-primaryScore;
        if ((topScore > secondTopScore) && (topScore < maxScore)){
            System.out.println("Greater than second top score and less than 100.");
        }
    }

    // bitwise operators: & and |
    // bit shift operators; <<; >>
    // bit inclusive or |
    //  bit exclusive or ^

    public static void assignmentOperator(){
        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar = true){
            System.out.println("Because we are dealing with boolean, this if is not giving an obvious error," +
                    " but it is not working correctly because it is not checking anything.");
        }
    }

    public static void ternaryOperator(){
        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar solved as true");
        }
        else{
            System.out.println("wasCar solved as false");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient >= 18) ? true : false;
        if (isEighteenOrOver){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    public static void challengeOnOperators(){
        double twentyVar = 20d;
        double eightyVar = 80d;
        double resultVar = (double) (twentyVar + eightyVar)*100;

        int reminderStep3 = (int) (resultVar % 40);

        boolean reminderStep3Is0 = reminderStep3 == 0;  // instead of (reminderStep3 == 0) ? true : false;

        System.out.println("The reminder in step 3 is 0: "+reminderStep3Is0);

        if (!reminderStep3Is0){
            System.out.println("Got some reminder");
        }

    }

}
