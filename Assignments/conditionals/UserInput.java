
// Q: Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
// Q: Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.*;

public class UserInput {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int total = sum(in);
            int largest = largestNum(in);

            System.out.println("Sum: " + total);
            System.out.println("Largest: " + largest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static int sum(Scanner in) {
        int res = 0, num;
        System.out.println("For sum....");
        while ((num = in.nextInt()) != 0) {
            res += num;
        }
        return res;
    }

    static int largestNum(Scanner in) {
        int res = 0, num;
        System.out.println("For Largest num....");
        while ((num = in.nextInt()) != 0) {
            if (num > res) {
                res = num;
            }
        }
        return res;
    }
}