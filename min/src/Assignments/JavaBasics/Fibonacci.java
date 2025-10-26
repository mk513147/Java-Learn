
// Q: To calculate Fibonacci Series up to n numbers.
import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the number upto which you want to print the Fibonacci series: ");
            int num = in.nextInt();
            fibo(num);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void fibo(int num) {
        int n1 = 0, n2 = 1;
        if (num <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
            return;
        }

        System.out.print("Fibonacci Series: ");

        if (num >= 1) {
            System.out.print(n1 + " ");
        }

        if (num >= 2) {
            System.out.print(n2 + " ");
        }
        for (int i = 2; i <= num; i++) {
            int next = n2 + n1;
            System.out.print(next + " ");
            n1 = n2;
            n2 = next;
        }
    }
}