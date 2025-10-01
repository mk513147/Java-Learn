
// Q: Prime number
import java.util.*;

public class Prime {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = in.nextInt();

            if (isPrime(num)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
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