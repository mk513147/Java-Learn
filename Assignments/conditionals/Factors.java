
// Q: Input a number and print all the factors of that number (use loops).
import java.util.*;

public class Factors {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            System.out.println("Factors are:-");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}