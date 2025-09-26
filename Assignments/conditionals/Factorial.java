
// Q: Factorial of a number
import java.util.*;

public class Factorial {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.print("Factorial is: " + fact);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}