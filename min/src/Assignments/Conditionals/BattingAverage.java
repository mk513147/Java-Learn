
// Q: Calculate the batting average
import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the total number of runs scored: ");
        int runs = in.nextInt();

        System.out.print("Enter number of times player has been out: ");
        int out = in.nextInt();

        double ba = (double) runs / out;

        System.out.printf("Batting Average: %.2f%n", ba);

        in.close();
    }
}