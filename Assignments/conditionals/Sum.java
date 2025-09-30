// Q: Write a program to print the sum of negative numbers, sum of positive even
// numbers and the sum of positive odd numbers from a list of numbers (N)
// entered by the user. The list terminates when the user enters a zero.

import java.util.*;

public class Sum {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int num, sumNev = 0, sumPosEven = 0, sumPosOdd = 0;
            System.out.println("Enter the numbers and press 0 to exit.");
            while ((num = in.nextInt()) != 0) {
                if (num >= 0 && num % 2 == 0) {
                    sumPosEven += num;
                } else if (num >= 0 && num % 2 != 0) {
                    sumPosOdd += num;
                } else if (num < 0) {
                    sumNev += num;
                }
            }
            System.out.println("Sum of negative numbers: " + sumNev);
            System.out.println("Sum of positive even numbers: " + sumPosEven);
            System.out.println("Sum of positive odd numbers: " + sumPosOdd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}