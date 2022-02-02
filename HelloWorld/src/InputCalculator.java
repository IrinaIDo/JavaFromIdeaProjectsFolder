import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args){
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        double ct = 0;
        while (true) {
            if (sc.hasNextInt()) {
                int x = sc.nextInt();
                sum += x;
                ct++;
                avg = (long)Math.round(sum / ct);
            } else {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
    }
}