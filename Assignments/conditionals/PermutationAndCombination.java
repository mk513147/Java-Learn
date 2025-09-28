
// Q: Find NCR and NPR
import java.util.*;

public class PermutationAndCombination {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter total number of items: ");
            int n = in.nextInt();
            System.out.print("Enter number of items chosen: ");
            int r = in.nextInt();
            System.out.println("Combination(NCR) is: " + combination(n, r));
            System.out.println("Permutation(NPR) is: " + permutation(n, r));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    static int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}