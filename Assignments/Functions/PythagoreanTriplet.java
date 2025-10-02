// Q: Write a function to check if a given triplet is a Pythagorean triplet or
// not.

import java.util.*;

public class PythagoreanTriplet {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            int num1 = in.nextInt();

            System.out.print("Enter second number: ");
            int num2 = in.nextInt();

            System.out.print("Enter second number: ");
            int num3 = in.nextInt();

            if (isTriplet(num1, num2, num3)) {
                System.out.println("The numbers are Pythagorean Triplet.");
            } else {
                System.out.println("The numbers are NOT Pythagorean Triplet.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static boolean isTriplet(int a, int b, int c) {
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)
                || Math.pow(c, 2)
                        + Math.pow(b, 2) == Math.pow(a, 2)) {
            return true;
        }
        return false;
    }
}