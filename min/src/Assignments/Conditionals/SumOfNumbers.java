
// Q: Sum of N numbers
import java.util.*;

public class SumOfNumbers {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the number upto which you want sum: ");
            int num = in.nextInt();
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}