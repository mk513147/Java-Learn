// Q: Calculate the future investment value

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double p = in.nextDouble();

        System.out.print("Enter the annual rate of interest (in %): ");
        double r = in.nextDouble();

        r = r / 100;

        System.out.print("Enter the time in years: ");
        double t = in.nextDouble();

        System.out.println("Compounding frequency options:");
        System.out.println("1. Annually (1)");
        System.out.println("2. Quarterly (4)");
        System.out.println("3. Monthly (12)");
        System.out.print("Enter compounding frequency: ");
        int n = in.nextInt();

        double fv = p * Math.pow((1 + r / n), n * t);

        System.out.printf("Future Investment Value: %.2f\n", fv);

        in.close();
    }
}
