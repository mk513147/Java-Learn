
// Q: Find the sum of the digits of a number
import java.util.*;

public class SumOfDigit {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }

            System.out.println("Sum of the digits is: " + sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}