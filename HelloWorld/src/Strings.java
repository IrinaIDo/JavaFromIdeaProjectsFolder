public class Strings {

    public static void main(String[] args){
        firstExOnStrings();
    }

    public static void firstExOnStrings(){
        tryoutStrings();
        stringIntDouble();
    }

    public static void tryoutStrings(){
        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + " anything else";
        System.out.println(myString);
        myString = myString + " \u00A9 2022";
        System.out.println(myString);
    }

    public static void stringIntDouble(){
        String lastString = "10";
        int myInt = 50;
        lastString = lastString+myInt;
        System.out.println("Last string is equal to "+lastString);
        double doubleNumber = 120.47d;
        lastString = lastString+doubleNumber;
        System.out.println("Last string is equal to "+lastString);
    }

}