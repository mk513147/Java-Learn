// Q: Calculate compound interest

import java.util.Scanner;

public class CompundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principle amount: ");
        double p = in.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double r = in.nextDouble();

        System.out.print("Enter the time in years: ");
        double t = in.nextDouble();

        double amt = p * Math.pow((1 + (r / 100)), t);
        double ci = amt - p;
        System.out.printf("Compound interest: %.2f%n", ci);

        in.close();
    }
}