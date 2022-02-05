public class NumberPalindrome {
    public static void main(String[] args){

    }

    public static boolean isPalindrome(int number){
        int num = number;
        int reverse = 0;
        int lastDigit = 0;
        while(num != 0){
            lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }
        return reverse == number;
    }
}