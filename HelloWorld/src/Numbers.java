public class Numbers {

    public static void main(String[] args){
        firstSetOfExercises();
        secondSetOfExercises();
    }

    public static void secondSetOfExercises(){
        floatDoubleValues();
        challengeConvertPoundsToKilogram();
        anotherOperations();
    }

    public static void anotherNumberExercises(){
        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi + " and " + anotherNumber);
    }

    public static void challengeConvertPoundsToKilogram(){
        double numberOfPounds = 200d;
        double resultedKilograms = 0.45359237d*numberOfPounds;

        System.out.println("We have " +resultedKilograms+"kg");
    }

    public static void floatDoubleValues(){
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println(myMinFloatValue+" "+myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println(myMaxDoubleValue+" "+myMinDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.5f;  // or (float)5.5
        double myDoubleValue = 5d;
        System.out.println(myIntValue);
        System.out.println(myDoubleValue);
        System.out.println(myFloatValue);

    }

    public static void firstSetOfExercises(){
        threeNumbers();
        myMinMaxValues();
        myLongValues();
        anotherOperations();

        challenge1PrimitiveTypes();
    }

    public static void challenge1PrimitiveTypes(){
        byte myByteVariable = Byte.MAX_VALUE;
        short myShortVariable = Short.MAX_VALUE;
        int myIntVariable = Integer.MAX_VALUE;

        long myLongResultVariable = (long) (5e4+10*(long)(myIntVariable+myByteVariable+myShortVariable));
        long myLongResultVariableNewApproach = 5000L+10L*(myIntVariable+myByteVariable+myShortVariable);

        System.out.println("The first approach for long variable calculus is: "+myLongResultVariable);
        System.out.println("The second approach for long variable calculus is: "+myLongResultVariableNewApproach);
    }

    public static void anotherOperations(){
        int myTotal = (Integer.MIN_VALUE/2);
        System.out.println(myTotal);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myNewByteValue = (byte)(myMinByteValue/2);
        System.out.println(myNewByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myNewShortValue = (short)(myMinShortValue/2);
        System.out.println(myNewShortValue);
    }

    public static void myLongValues(){
//        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value: "+myMinLongValue);
        System.out.println("Long maximum value: "+myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println("Bit long literal value: "+bigLongLiteralValue);

    }

    public static void myMinMaxValues(){
//        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.print("Integer minimum value = "+myMinIntValue);
        System.out.print("Integer maximum value = "+myMaxIntValue);

        System.out.print("Busted minimum value = "+(myMinIntValue-1));
        System.out.print("Busted maximum value = "+(myMaxIntValue+1));

//        int myMaxIntTest = 2_147_483_647;

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value: "+myMinShortValue);
        System.out.println("Short maximum value: "+myMaxShortValue);

//        short bigShortLiteralValue = 32767;
    }

    public static void threeNumbers(){
        int myFirstNumber = (10+5)+(2*10);
        System.out.println(myFirstNumber);

        int mySecondNumber = 12;
        int myThirdNumber = 6;

        int myTotal = myFirstNumber+mySecondNumber+myThirdNumber;
        System.out.println(myTotal);

        int myLastOne = 1000-myTotal;
        System.out.println(myLastOne);
    }
}
