import java.util.*;

public class prime {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = in.nextInt();
            isPrime(n);

        } catch (Exception e) {
            System.out.println("Error: " + e.getClass().getName());
            System.out.println("Message: " + e.getMessage());
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number.");
                return false;
            }

        }
        System.out.println(n + " is a prime number.");
        return true;
    }
}