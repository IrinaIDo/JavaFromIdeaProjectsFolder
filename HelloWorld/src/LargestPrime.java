public class LargestPrime {
    public static void main(String[] args){
        System.out.println(getLargestPrime(87));
    }

    public static int getLargestPrime(int number) {
        if(number <= 1){
            return -1;
        }
        int div = 2;
        while(div < number){
            if(number%div != 0){
                div++;
            } else{
                number /= div;
                div = 2;
            }
        }
        return number;
    }
}