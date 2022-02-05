public class DecimalComparator{
    public static void main(String[] args){

    }


    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
        int a = (int)(d1 * 1000);
        int b = (int)(d2 * 1000);
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}