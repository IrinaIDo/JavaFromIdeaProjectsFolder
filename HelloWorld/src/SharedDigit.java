public class SharedDigit {
    public static void main(String[] args){

    }

    public static boolean hasSharedDigit(int a, int b){
        if((a < 10) || (a > 99) || (b < 10) || (b > 99)){
            return false;
        }
        int digitA = 0;
        int digitB = 0;
        while(a != 0){
            int bb = b;
            digitA = a % 10;
            while(bb != 0){
                digitB = bb % 10;
                if(digitA == digitB){
                    return true;
                } else {
                    bb /= 10;
                }
            }
            a /= 10;
        }
        return false;
    }
}