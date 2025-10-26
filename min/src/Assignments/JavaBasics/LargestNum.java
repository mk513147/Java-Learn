
// Q: Take 2 numbers as input and print the largest number.
import java.util.*;

public class LargestNum {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter two numbers: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println("Largest Number: " + compare(num1, num2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static int compare(int a, int b) {
        if (a > b)
            return a;
        return b;
    }
}