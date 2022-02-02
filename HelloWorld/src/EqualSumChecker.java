public class EqualSumChecker {
    public static void main(String[] args){

    }


    public static boolean hasEqualSum(int v1, int v2, int v3){
        int s = v1 + v2;
        if(v3 == s) {
            return true;
        }
        else {
            return false;
        }
    }
}