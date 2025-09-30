// Q: Write a program to print the sum of negative numbers, sum of positive even
// numbers and the sum of positive odd numbers from a list of numbers (N)
// entered by the user. The list terminates when the user enters a zero.

import java.util.*;

public class Sum {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int sumNegative = 0;
            int sumPositiveEven = 0;
            int sumPositiveOdd = 0;

            System.out.println("Enter numbers (0 to stop):");

            while (true) {
                int num = in.nextInt();

                if (num == 0) {
                    break;
                } else if (num < 0) {
                    sumNegative += num;
                } else {
                    if (num % 2 == 0) {
                        sumPositiveEven += num;
                    } else {
                        sumPositiveOdd += num;
                    }
                }
            }

            System.out.println("Sum of negative numbers: " + sumNegative);
            System.out.println("Sum of positive even numbers: " + sumPositiveEven);
            System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}