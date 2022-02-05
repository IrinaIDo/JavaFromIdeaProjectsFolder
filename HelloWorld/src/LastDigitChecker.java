public class LastDigitChecker {
    public static void main(String[] args){

    }

    public static boolean hasSameLastDigit(int a, int b, int c){
        if((a < 10)||(a > 1000)||(b < 10)||(b > 1000)||(c < 10)||(c > 1000)){
            return false;
        }
        int digitA = a % 10;
        int digitB = b % 10;
        int digitC = c % 10;
        return ((digitA == digitB)||(digitA == digitC)||(digitB == digitC));
    }

    public static boolean isValid(int n){
        return (n >= 10 && n <= 1000);
    }
}