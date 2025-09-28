
// Q: Calculate Depreciation of Value
import java.util.Scanner;

public class DepreciationValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Cost Price: ");
        int cp = in.nextInt();

        System.out.print("Enter the Salvage Value: ");
        int sv = in.nextInt();

        System.out.print("Enter the duration of useful life: ");
        int years = in.nextInt();

        double dp = (double) (cp - sv) / years;

        System.out.printf("Depreciation Value is :%.2f%n", dp);

        in.close();
    }
}