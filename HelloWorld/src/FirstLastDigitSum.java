public class FirstLastDigitSum {
    public static void main(String[] args){

    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        } else {
            int firstDigit = number % 10;
            while(number >= 10){
                number /= 10;
            }
            int lastDigit = number;
            return firstDigit + lastDigit;
        }
    }
}