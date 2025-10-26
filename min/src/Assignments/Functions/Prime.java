
// Q: Prime number
import java.util.*;

public class Prime {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = in.nextInt();

            if (num1 <= 0) {
                System.out.println("The number must be greater than 0.");
                return;
            }

            System.out.print("Enter second number: ");
            int num2 = in.nextInt();

            if (num2 <= num1) {
                System.out.println("The second number must be greater than the first one.");
                return;
            }

            for (int i = num1; i <= num2; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}