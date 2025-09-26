
// Q: Subtract the Product and Sum of Digits of an Integer
import java.util.*;

public class Difference {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int num = in.nextInt();
            System.out.print("Difference in the Product and sum is: " + subtractProductAndSum(num));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static int subtractProductAndSum(int num) {
        int sum = 0, product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num = num / 10;
        }
        return product - sum;
    }
}