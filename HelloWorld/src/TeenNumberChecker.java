public class TeenNumberChecker {
    public static void main(String[] args){

    }

    public static boolean hasTeen(int v1, int v2, int v3){
        if (v1 >=13 && v1 <= 19){
            return true;
        } else if(v2 >= 13 && v2 <= 19) {
            return true;
        } else if(v3 >= 13 && v3 <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int v){
        if (v >= 13 && v <= 19){
            return true;
        } else {
            return false;
        }
    }
}